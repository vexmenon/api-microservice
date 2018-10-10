package com.candidate.api.interceptor;

import com.candidate.api.constants.ApplicationConstants;
import com.candidate.api.constants.ErrorConstants;
import com.candidate.api.entities.WebServiceConfig;
import com.candidate.api.service.AuthenticationService;
import com.candidate.api.util.CommonUtil;
import com.candidate.api.util.HttpUtil;
import com.candidate.api.vo.WebServiceResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.UUID;


/**
 * TODO:- Need to log http request using a filter. Currently no good options for it
 *
 */

@Component
public class RequestInterceptor extends HandlerInterceptorAdapter {

    private static final Logger logger = Logger
            .getLogger(RequestInterceptor.class);



    @Autowired
    private AuthenticationService authenticationService;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    private HttpUtil httpUtil;

    private String transactionId;



    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object object) throws Exception {
       WebServiceResponse webServiceResponse = null;
       try{
           //Prevent pre handle for getting called multiple times
           if (request.getDispatcherType().name() != "REQUEST") {
               return true;
           }
           String accessToken = request.getHeader(ApplicationConstants.ACCESS_TOKEN);
           transactionId = UUID.randomUUID().toString();
           //Checks if access token is present
           if(StringUtils.isBlank(accessToken)){
               httpUtil.parseRequestAndLogInDatabase(request,transactionId);
               webServiceResponse = new WebServiceResponse(ErrorConstants.ERROR_NO_ACCESS_TOKEN, HttpStatus.BAD_REQUEST.value(),HttpStatus.INTERNAL_SERVER_ERROR.name());
               writeToResponse(webServiceResponse,response);
               return false;
           }
           String decodeAccessToken = CommonUtil.decryptTwoWay(accessToken);
           String []tokens = decodeAccessToken.split(":");
           WebServiceConfig config = authenticationService.fetchJobServiceConfig(tokens[0], tokens[1]);
           //Checks if record exists in jobwebservice table
           if(config!=null){
               request.setAttribute(ApplicationConstants.COMPANY_MSTR_SEQ_ATTR, config.getCompanyMstrSeq());
               request.setAttribute(ApplicationConstants.TRANSACTION_ID,transactionId);
               return true;
           }else{
               httpUtil.parseRequestAndLogInDatabase(request,transactionId);
               webServiceResponse = new WebServiceResponse(ErrorConstants.ERROR, HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name());
               writeToResponse(webServiceResponse,response);
               return false;
           }
       }catch(Exception e){
           webServiceResponse = new WebServiceResponse(ErrorConstants.ERROR, HttpStatus.BAD_REQUEST.value(),HttpStatus.BAD_REQUEST.name());
           writeToResponse(webServiceResponse,response);
           return false;
       }
    }


    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object object, Exception arg3)
            throws Exception {
     WebServiceResponse webServiceResponse = null;
      switch(response.getStatus()){
           case 500:
                webServiceResponse = new     WebServiceResponse(ErrorConstants.ERROR,HttpStatus.INTERNAL_SERVER_ERROR.value(),HttpStatus.INTERNAL_SERVER_ERROR.name());
                writeToResponse(webServiceResponse,response);
                break;
          case 400:
              webServiceResponse = new WebServiceResponse(ErrorConstants.ERROR,HttpStatus.BAD_REQUEST.value(),ErrorConstants.ERROR_PARAMETER_MISSING_RHID);
              writeToResponse(webServiceResponse,response);
              break;

       }

    }

    private void writeToResponse(WebServiceResponse webServiceResponse,HttpServletResponse response) throws Exception{
        response.setContentType("application/json");
        response.setHeader("Content-Type", "application/json;charset=UTF-8");
        response.setStatus(webServiceResponse.getResponseCode());
        PrintWriter writer = response.getWriter();
        String jsonInString = objectMapper.writeValueAsString(webServiceResponse);
        httpUtil.parseResponseAndLogInDatabase(jsonInString,transactionId);
        writer.write(jsonInString);
        writer.close();
    }




}
