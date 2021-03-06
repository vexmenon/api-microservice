package com.candidate.api.entities;

// Generated Aug 16, 2014 12:28:35 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * CompanyConfig generated by hbm2java
 */
@Entity
@Table(name = "web_services_payload_log")
public class WebServicesLog implements java.io.Serializable {

	private Integer web_services_log_seq;
	private int companyMstrSeq;
	private String transactionId;
	private String message;
    private String operation;
	private char status;
    private char type;
    private int createdBy;
	private Date createDttm;
	private Integer updatedBy;
	private Date updateDttm;

	public WebServicesLog() {
	}

	public WebServicesLog(int companyMstrSeq, String transactionId, String message,
                          char status, int createdBy, Date createDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.transactionId = transactionId;
		this.message = message;
		this.status = status;
        this.type = type;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
	}

	public WebServicesLog(int companyMstrSeq, String transactionId, String message,
                          char status, int createdBy, Date createDttm, Integer updatedBy,
                          Date updateDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.transactionId = transactionId;
		this.message= message;
		this.status = status;
        this.type = type;
		this.createdBy = createdBy;
		this.createDttm = createDttm;
		this.updatedBy = updatedBy;
		this.updateDttm = updateDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "WEB_SERVICES_LOG_SEQ", unique = true, nullable = false)
	public Integer getWebServicesLogSeq() {
		return this.web_services_log_seq;
	}

	public void setWebServicesLogSeq(Integer web_services_log_seq) {
		this.web_services_log_seq = web_services_log_seq;
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
	@Column(name = "MESSAGE", nullable = false, length = 2147483647)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

    @Column(name = "OPERATION", nullable = true, length = 100)
    public String getOperation() {
        return this.operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
	@Column(name = "STATUS", nullable = false, length = 1)
	public char getStatus() {
		return this.status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

    @Column(name = "TYPE", nullable = false, length = 1)
    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.status = type;
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
