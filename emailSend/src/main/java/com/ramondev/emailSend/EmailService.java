package com.ramondev.emailSend;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class EmailService {
    private final JavaMailSender mailSender;

    public void sendEmail(Email email) {
        var message = new SimpleMailMessage();
        message.setFrom("noreply@email.com");
        message.setTo(email.to());
        message.setSubject(email.subject());
        message.setText(email.body());
        mailSender.send(message);

    }

}
