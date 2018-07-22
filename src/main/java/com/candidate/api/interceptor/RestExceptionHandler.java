/*
package com.candidate.api.interceptor;

import com.candidate.api.vo.WebServiceResponse;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        String error = "";
        return buildResponseEntity(new WebServiceResponse(error,status.value(),error),status);
    }

    private ResponseEntity<Object> buildResponseEntity(WebServiceResponse webServiceResponse,HttpStatus status) {
        return new ResponseEntity<>(webServiceResponse,status);
    }

}
*/
