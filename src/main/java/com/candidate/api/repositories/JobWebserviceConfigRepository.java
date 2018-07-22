package com.candidate.api.repositories;

import com.candidate.api.entities.JobWebserviceConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobWebserviceConfigRepository extends JpaRepository<JobWebserviceConfig,Integer>{

    JobWebserviceConfig findByAccessKeyAndAccessSecretAndStatus(String accessKey , String accessSecret, Character status);

}
