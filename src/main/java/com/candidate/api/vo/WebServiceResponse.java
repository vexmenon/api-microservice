package com.candidate.api.vo;

public class WebServiceResponse implements java.io.Serializable{
    private String responseStatus;
    private Integer responseCode;
    private String responseMessage;

    public WebServiceResponse() {
    }

    public WebServiceResponse(String responseStatus, Integer responseCode,String responseMessage) {
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }
    public WebServiceResponse(String responseStatus, Integer responseCode) {
        this.responseStatus = responseStatus;
        this.responseCode = responseCode;

    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
