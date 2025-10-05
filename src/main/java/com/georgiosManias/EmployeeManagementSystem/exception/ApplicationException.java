package com.georgiosManias.EmployeeManagementSystem.exception;


import lombok.Getter;

@Getter //This annotation helps Get the custome message.
public class ApplicationException extends RuntimeException {
    private final  String customMessage;

    public ApplicationException(String customMessage) {
        this.customMessage = customMessage;
    }




}
