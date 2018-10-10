package com.candidate.api.service;


import com.candidate.api.constants.ApplicationConstants;
import com.candidate.api.entities.WebServiceConfig;
import com.candidate.api.entities.RestApiLog;
import com.candidate.api.exception.ApplicationException;
import com.candidate.api.repositories.WebserviceConfigRepository;
import com.candidate.api.repositories.RestApiLogRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class AuthenticationService {
    private static final Logger logger = Logger
            .getLogger(AuthenticationService.class);

    @Autowired
    private WebserviceConfigRepository webserviceConfigRepository;

    @Autowired
    private RestApiLogRepository restApiLogRepository;

    public WebServiceConfig fetchJobServiceConfig(String accessKey, String accessSecret) throws ApplicationException{
        WebServiceConfig webServiceConfig = null;
        try{
            webServiceConfig = webserviceConfigRepository.findByAccessKeyAndAccessSecretAndStatus(accessKey,accessSecret, ApplicationConstants.CHAR_A);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in fetchJobServiceConfig"+e);
        }
        return webServiceConfig;

    }

    public RestApiLog fetchRestApiLogByTransactionId(String tranId){
        RestApiLog restApiLog = null;
        try{
            restApiLog = restApiLogRepository.findByTransactionId(tranId);
        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in fetchRestApiLogByTransactionId"+e);
        }
        return restApiLog;
    }


    public void saveRestApiLogRecord(RestApiLog log,boolean isInsert){
        try{
            if(isInsert){
                restApiLogRepository.save(log);
            }else{
                RestApiLog restApiLog = restApiLogRepository.findByTransactionId(log.getTransactionId());
                restApiLog.setResponseMessage(log.getResponseMessage());
                restApiLog.setUpdateDttm(new Date());
                restApiLogRepository.save(log);
            }

        }catch(Exception e){
            e.printStackTrace();
            logger.error("Error in saveRestApiLogRecord"+e);
        }
    }

}
