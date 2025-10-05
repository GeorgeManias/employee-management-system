package com.georgiosManias.EmployeeManagementSystem.service.impl;

import com.georgiosManias.EmployeeManagementSystem.exception.ApplicationException;
import com.georgiosManias.EmployeeManagementSystem.service.EmailService;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    private final JavaMailSender mailSender;

    public EmailServiceImpl(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    @Override
    public void sendEmployeeWelcomeEmail(String to, String employeeName) {

        try {
            SimpleMailMessage message = new SimpleMailMessage();

            message.setFrom("georgiosmanias.test@gmail.com");
            message.setTo(to);
            message.setSubject("Welcome to our Company");
            message.setText("Hello " + employeeName + ",\n\nWelcome! You have been successfully registered.\n\n- ABC Corporation!!.");

            mailSender.send(message);
            System.out.println("System has been sent.");
        } catch (MailException e){ throw new ApplicationException("Email not send.");
        }
    }
}
