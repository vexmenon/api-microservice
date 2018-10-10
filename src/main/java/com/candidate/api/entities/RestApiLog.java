package com.candidate.api.entities;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "rest_api_log")
public class RestApiLog implements java.io.Serializable {

    private Integer restApiLogSeq;
    private int companyMstrSeq;
    private String transactionId;
    private String requestMessage;
    private String responseMessage;
    private String operation;
    private String description;
    private char status;
    private int createdBy;
    private Date createDttm;
    private Integer updatedBy;
    private Date updateDttm;

    public RestApiLog() {
    }

    public RestApiLog(String description,Integer companyMstrSeq, String transactionId,String requestMessage,String responseMessage , String operation, char status, int createdBy, Date createDttm) {
        this.description = description;
        this.companyMstrSeq = companyMstrSeq;
        this.transactionId = transactionId;
        this.requestMessage = requestMessage;
        this.responseMessage = responseMessage;
        this.operation = operation;
        this.status = status;
        this.createdBy = createdBy;
        this.createDttm = createDttm;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "REST_API_LOG_SEQ", unique = true, nullable = false)
    public Integer getRestApiLogSeq() {
        return restApiLogSeq;
    }

    public void setRestApiLogSeq(Integer restApiLogSeq) {
        this.restApiLogSeq = restApiLogSeq;
    }

    @Column(name = "COMPANY_MSTR_SEQ", nullable = false)
    public int getCompanyMstrSeq() {
        return this.companyMstrSeq;
    }

    public void setCompanyMstrSeq(int companyMstrSeq) {
        this.companyMstrSeq = companyMstrSeq;
    }

    @Column(name = "TRANSACTION_ID", nullable = false, length = 100)
    public String getTransactionId() {
        return this.transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Lob
    @Column(name = "REQUEST_MESSAGE", nullable = false, length = 2147483647)
    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    @Lob
    @Column(name = "RESPONSE_MESSAGE", nullable = false, length = 2147483647)
    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    @Column(name = "OPERATION", nullable = true, length = 100)
    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Column(name = "DESCRIPTION", nullable = true, length = 50)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Column(name = "STATUS", nullable = false, length = 1)
    public char getStatus() {
        return this.status;
    }

    public void setStatus(char status) {
        this.status = status;
    }


    @Column(name = "CREATED_BY", nullable = false)
    public int getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATE_DTTM", nullable = false, length = 19)
    public Date getCreateDttm() {
        return this.createDttm;
    }

    public void setCreateDttm(Date createDttm) {
        this.createDttm = createDttm;
    }

    @Column(name = "UPDATED_BY")
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "UPDATE_DTTM", length = 19)
    public Date getUpdateDttm() {
        return this.updateDttm;
    }

    public void setUpdateDttm(Date updateDttm) {
        this.updateDttm = updateDttm;
    }

}
