package com.georgiosManias.EmployeeManagementSystem.entities;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorDetails {
    private String message;

    private HttpStatus status;

    private String debugMessage;

    private LocalDateTime dateTime;

    private String details;

    public ErrorDetails(String message, HttpStatus status, String debugMessage, LocalDateTime dateTime, String details) {
        this.message = message;
        this.status = status;
        this.debugMessage = debugMessage;
        this.dateTime = dateTime;
        this.details = details;
    }

    public ErrorDetails() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
