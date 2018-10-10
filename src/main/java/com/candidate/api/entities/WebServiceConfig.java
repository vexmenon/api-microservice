package com.candidate.api.entities;

// Generated Aug 3, 2015 1:41:42 PM by Hibernate Tools 4.0.0

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * WebServiceConfig generated by hbm2java
 */
@Entity
@Table(name = "web_service_config")
public class WebServiceConfig implements java.io.Serializable {

	private Integer webservicesConfigSeq;
	private int companyMstrSeq;
	private String accessKey;
	private String accessSecret;
	private String channel;
	private char status;
	private int createdBy;
	private Date createdDttm;
	private Integer updatedBy;
	private Date updatedDttm;

	public WebServiceConfig() {
	}

	public WebServiceConfig(int companyMstrSeq, String accessKey,
							String accessSecret, String channel, char status, int createdBy,
							Date createdDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.accessKey = accessKey;
		this.accessSecret = accessSecret;
		this.channel = channel;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
	}

	public WebServiceConfig(int companyMstrSeq, String accessKey,
							String accessSecret, String channel, char status, int createdBy,
							Date createdDttm, Integer updatedBy, Date updatedDttm) {
		this.companyMstrSeq = companyMstrSeq;
		this.accessKey = accessKey;
		this.accessSecret = accessSecret;
		this.channel = channel;
		this.status = status;
		this.createdBy = createdBy;
		this.createdDttm = createdDttm;
		this.updatedBy = updatedBy;
		this.updatedDttm = updatedDttm;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "WEBSERVICES_CONFIG_SEQ", unique = true, nullable = false)
	public Integer getWebservicesConfigSeq() {
		return this.webservicesConfigSeq;
	}

	public void setWebservicesConfigSeq(Integer webservicesConfigSeq) {
		this.webservicesConfigSeq = webservicesConfigSeq;
	}

	@Column(name = "COMPANY_MSTR_SEQ", nullable = false)
	public int getCompanyMstrSeq() {
		return this.companyMstrSeq;
	}

	public void setCompanyMstrSeq(int companyMstrSeq) {
		this.companyMstrSeq = companyMstrSeq;
	}

	@Column(name = "ACCESS_KEY", nullable = false, length = 50)
	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	@Column(name = "ACCESS_SECRET", nullable = false, length = 50)
	public String getAccessSecret() {
		return this.accessSecret;
	}

	public void setAccessSecret(String accessSecret) {
		this.accessSecret = accessSecret;
	}

	@Column(name = "CHANNEL", nullable = false, length = 50)
	public String getChannel() {
		return this.channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
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
	@Column(name = "CREATED_DTTM", nullable = false, length = 19)
	public Date getCreatedDttm() {
		return this.createdDttm;
	}

	public void setCreatedDttm(Date createdDttm) {
		this.createdDttm = createdDttm;
	}

	@Column(name = "UPDATED_BY")
	public Integer getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATED_DTTM", length = 19)
	public Date getUpdatedDttm() {
		return this.updatedDttm;
	}

	public void setUpdatedDttm(Date updatedDttm) {
		this.updatedDttm = updatedDttm;
	}

}