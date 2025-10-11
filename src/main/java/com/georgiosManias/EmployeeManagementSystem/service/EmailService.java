package com.georgiosManias.EmployeeManagementSystem.service;

import com.georgiosManias.EmployeeManagementSystem.payload.request.EmailDetails;

public interface EmailService {
    void sendEmailAlert(EmailDetails emailDetails);

}
