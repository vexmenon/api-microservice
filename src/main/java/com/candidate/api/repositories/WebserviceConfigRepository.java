package com.candidate.api.repositories;

import com.candidate.api.entities.WebServiceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WebserviceConfigRepository extends JpaRepository<WebServiceConfig,Integer>{

    WebServiceConfig findByAccessKeyAndAccessSecretAndStatus(String accessKey , String accessSecret, Character status);

}
