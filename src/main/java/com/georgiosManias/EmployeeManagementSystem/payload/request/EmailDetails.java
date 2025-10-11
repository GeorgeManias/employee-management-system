package com.georgiosManias.EmployeeManagementSystem.payload.request;

public class EmailDetails {
    private String messageBody;

    private String recipient;

    private String attachment;

    private String subject;

    private boolean isHtml;

    public EmailDetails(String messageBody, String recipient, String attachment, String subject, boolean isHtml) {
        this.messageBody = messageBody;
        this.recipient = recipient;
        this.attachment = attachment;
        this.subject = subject;
        this.isHtml = isHtml;
    }

    public EmailDetails() {
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isHtml() {
        return isHtml;
    }

    public void setHtml(boolean html) {
        isHtml = html;
    }
}
