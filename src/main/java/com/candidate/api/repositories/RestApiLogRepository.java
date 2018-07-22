package com.candidate.api.repositories;

import com.candidate.api.entities.RestApiLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestApiLogRepository extends JpaRepository<RestApiLog,Integer>{

    RestApiLog findByTransactionId(String transactionId);
}
