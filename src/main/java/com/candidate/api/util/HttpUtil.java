package com.candidate.api.util;

import com.candidate.api.constants.ApplicationConstants;
import com.candidate.api.entities.RestApiLog;
import com.candidate.api.exception.ApplicationException;
import com.candidate.api.service.AuthenticationService;
import com.candidate.api.vo.CandidateRequestVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.util.Date;
import java.util.Scanner;


@Component
public class HttpUtil {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private AuthenticationService authenticationService;

    public static String getRequestBody(final HttpServletRequest request) {
        final StringBuilder builder = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            if (reader == null) {

                return null;
            }
            String line;
            while ((line = reader.readLine()) != null) {
                builder.append(line);
            }
            return builder.toString();
        } catch (final Exception e) {

            return null;
        }
    }

    static String extractPostRequestBody(HttpServletRequest request) throws Exception{
        if ("POST".equalsIgnoreCase(request.getMethod())) {
                Scanner s = null;
                try {
                    s = new Scanner(request.getInputStream(), "UTF-8").useDelimiter("\\A");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return s.hasNext() ? s.next() : "";
        }
        return "";
    }

    public void parseRequestAndLogInDatabase(HttpServletRequest request,String transactionId) throws ApplicationException {
        String req = HttpUtil.getRequestBody(request);
        RestApiLog restApiLog = new RestApiLog("MIC-CAND-SERV",ApplicationConstants.INT_ZERO,transactionId, req, ApplicationConstants.STR_EMPTY,"MIC-CAND-SERV",ApplicationConstants.CHAR_A,ApplicationConstants.INT_ZERO, new Date());
        authenticationService.saveRestApiLogRecord(restApiLog,ApplicationConstants.TRUE);
    }

    public void parseResponseAndLogInDatabase(String responseJson,String transactionId) throws Exception {
        RestApiLog restApiLog = authenticationService.fetchRestApiLogByTransactionId(transactionId);
        restApiLog.setResponseMessage(responseJson);
        authenticationService.saveRestApiLogRecord(restApiLog,ApplicationConstants.FALSE);
    }

    public void parseRequestVOAndInsertInLog(CandidateRequestVO requestVO,String transactionId,boolean isInsert) throws Exception{
        RestApiLog restApiLog = null;
        if(isInsert){
            if(StringUtil.isStringNull(requestVO.getRipplehireId())){
                restApiLog = new RestApiLog("MIC-CAND-SERV",requestVO.getCompanyMstrSeq(),transactionId, ApplicationConstants.STR_EMPTY, ApplicationConstants.STR_EMPTY,"MIC-CAND-SERV",ApplicationConstants.CHAR_A,ApplicationConstants.INT_ZERO, new Date());
            }else{
                restApiLog = new RestApiLog("MIC-CAND-SERV",requestVO.getCompanyMstrSeq(),transactionId, objectMapper.writeValueAsString(requestVO), ApplicationConstants.STR_EMPTY,"MIC-CAND-SERV",ApplicationConstants.CHAR_A,ApplicationConstants.INT_ZERO, new Date());
            }
        }else{
            restApiLog = authenticationService.fetchRestApiLogByTransactionId(transactionId);
            restApiLog.setResponseMessage(objectMapper.writeValueAsString(requestVO));
        }

        authenticationService.saveRestApiLogRecord(restApiLog,isInsert);
    }



}
