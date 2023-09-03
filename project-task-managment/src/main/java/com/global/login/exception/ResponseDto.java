package com.global.login.exception;

public class ResponseDto<T>{
    private int code;
    private String message;
    private T body;


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public ResponseDto(int code, String message, T body) {
        this.code = code;
        this.message = message;
        this.body = body;
    }

    public ResponseDto() {
    }

}
