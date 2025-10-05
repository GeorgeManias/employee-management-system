package com.georgiosManias.EmployeeManagementSystem.exception;

import com.georgiosManias.EmployeeManagementSystem.entities.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(ApplicationException.class)
    public ResponseEntity<ErrorDetails> handleApplicationException(final ApplicationException e){
        ErrorDetails response =new ErrorDetails();
        response.setDateTime((LocalDateTime.now()));
        response.setDetails(String.valueOf(HttpStatus.BAD_REQUEST));
        response.setMessage((e.getMessage()));

        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
