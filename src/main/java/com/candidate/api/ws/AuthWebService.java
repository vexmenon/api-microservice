package com.candidate.api.ws;


import com.candidate.api.constants.ApplicationConstants;
import com.candidate.api.util.HttpUtil;
import com.candidate.api.util.StringUtil;
import com.candidate.api.vo.CandidateRequestVO;
import com.candidate.api.vo.CandidateResponseVO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.*;
import org.springframework.validation.Errors;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@RestController
public class AuthWebService {

    private static final Logger logger = Logger
            .getLogger(AuthWebService.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private HttpUtil httpUtil;

    @Value("${candidate-api-url-rhid}")
    String CANDIDATE_API_URL_RHID;

    @PostMapping("/v1/candidate")
    public ResponseEntity<CandidateResponseVO> test(@RequestBody CandidateRequestVO requestVO, HttpServletRequest request,
                                       HttpServletResponse response, Errors errors){

        try{
            requestVO.setCompanyMstrSeq((int)request.getAttribute(ApplicationConstants.COMPANY_MSTR_SEQ_ATTR));
            httpUtil.parseRequestVOAndInsertInLog(requestVO,(String)request.getAttribute(ApplicationConstants.TRANSACTION_ID),ApplicationConstants.TRUE);
            if (StringUtil.isStringNull(requestVO.getRipplehireId())) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.set("Content-Type", "application/json");
            HttpEntity httpEntity = new HttpEntity (requestVO, httpHeaders);
            CandidateResponseVO result = restTemplate.postForObject( CANDIDATE_API_URL_RHID,
                    httpEntity, CandidateResponseVO.class);
            httpUtil.parseResponseAndLogInDatabase(objectMapper.writeValueAsString(result),(String)request.getAttribute(ApplicationConstants.TRANSACTION_ID));
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }




    }


}
