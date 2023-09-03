package com.global.login.exception;

import java.util.List;

public class CustomeException extends RuntimeException {

    private int code;

    private String message;
    private List<ResponseDto> errors;{
    }

    public CustomeException(int code, String message, List<ResponseDto> errors) {
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    public CustomeException(String message, int code, String message1, List<ResponseDto> errors) {
        super(message);
        this.code = code;
        this.message = message1;
        this.errors = errors;
    }

    public CustomeException(String message, Throwable cause, int code, String message1, List<ResponseDto> errors) {
        super(message, cause);
        this.code = code;
        this.message = message1;
        this.errors = errors;
    }

    public CustomeException(Throwable cause, int code, String message, List<ResponseDto> errors) {
        super(cause);
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    public CustomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, int code, String message1, List<ResponseDto> errors) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.code = code;
        this.message = message1;
        this.errors = errors;
    }

    public CustomeException() {
    }

    public CustomeException(String message) {
        super(message);
    }

    public CustomeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomeException(Throwable cause) {
        super(cause);
    }

    public CustomeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CustomeException(int i, String youEnterInvalidId) {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ResponseDto> getErrors() {
        return errors;
    }

    public void setErrors(List<ResponseDto> errors) {
        this.errors = errors;
    }

    @Override
    public String toString() {
        return "CustomeException{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", errors=" + errors +
                '}';
    }
}
