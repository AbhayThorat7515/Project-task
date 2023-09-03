package com.global.login.exception;

import com.global.login.dto.ResponseErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;

import java.util.List;

public class ProjectException extends RuntimeException{
    private int code;

    private List<ResponseErrorDTO> responseErrorDtoList;

    private String message;

    private String message2;

    private BindingResult bindingResult;

    public ProjectException(BindingResult bindingResult, HttpStatus httpStatus, String s) {
    }

    public ProjectException(HttpStatus httpStatus, String s) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<ResponseErrorDTO> getResponseErrorDtoList() {
        return responseErrorDtoList;
    }

    public void setResponseErrorDtoList(List<ResponseErrorDTO> responseErrorDtoList) {
        this.responseErrorDtoList = responseErrorDtoList;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage2() {
        return message2;
    }

    public void setMessage2(String message2) {
        this.message2 = message2;
    }

    public BindingResult getBindingResult() {
        return bindingResult;
    }

    public void setBindingResult(BindingResult bindingResult) {
        this.bindingResult = bindingResult;
    }

    public ProjectException(int code, List<ResponseErrorDTO> responseErrorDtoList, String message, String message2, BindingResult bindingResult) {
        this.code = code;
        this.responseErrorDtoList = responseErrorDtoList;
        this.message = message;
        this.message2 = message2;
        this.bindingResult = bindingResult;
    }

    public ProjectException(String message, int code, List<ResponseErrorDTO> responseErrorDtoList, String message1, String message2, BindingResult bindingResult) {
        super(message);
        this.code = code;
        this.responseErrorDtoList = responseErrorDtoList;
        this.message = message1;
        this.message2 = message2;
        this.bindingResult = bindingResult;
    }

    public ProjectException(String message, Throwable cause, int code, List<ResponseErrorDTO> responseErrorDtoList, String message1, String message2, BindingResult bindingResult) {
        super(message, cause);
        this.code = code;
        this.responseErrorDtoList = responseErrorDtoList;
        this.message = message1;
        this.message2 = message2;
        this.bindingResult = bindingResult;
    }

    public ProjectException(Throwable cause, int code, List<ResponseErrorDTO> responseErrorDtoList, String message, String message2, BindingResult bindingResult) {
        super(cause);
        this.code = code;
        this.responseErrorDtoList = responseErrorDtoList;
        this.message = message;
        this.message2 = message2;
        this.bindingResult = bindingResult;
    }

    public ProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code, List<ResponseErrorDTO> responseErrorDtoList, String message1, String message2, BindingResult bindingResult) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.responseErrorDtoList = responseErrorDtoList;
        this.message = message1;
        this.message2 = message2;
        this.bindingResult = bindingResult;
    }

    public ProjectException() {
    }

    public ProjectException(String message) {
        super(message);
    }

    public ProjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProjectException(Throwable cause) {
        super(cause);
    }

    public ProjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public String toString() {
        return "ProjectException{" +
                "code=" + code +
                ", responseErrorDtoList=" + responseErrorDtoList +
                ", message='" + message + '\'' +
                ", message2='" + message2 + '\'' +
                ", bindingResult=" + bindingResult +
                '}';
    }
}
