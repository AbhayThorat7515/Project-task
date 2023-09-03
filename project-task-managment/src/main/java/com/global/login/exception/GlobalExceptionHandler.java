package com.global.login.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ProjectException.class)
    public ResponseEntity<?> ProjectException(ProjectException projectException) {

        ResponseDto responseDTO = new ResponseDto();
        responseDTO.setCode(projectException.getCode());
        responseDTO.setMessage(projectException.getMessage());
        projectException.printStackTrace();
        return ResponseEntity.internalServerError().body(responseDTO);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> exceptionHandler(Exception exception) {

        ResponseDto responseDTO = new ResponseDto();
        responseDTO.setCode(500);
        responseDTO.setMessage(exception.getMessage());
        exception.printStackTrace();
        return ResponseEntity.internalServerError().body(responseDTO);
    }
}
