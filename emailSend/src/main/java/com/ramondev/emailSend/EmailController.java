package com.ramondev.emailSend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("email")
@Data
public class EmailController {
    private final EmailService es;

    @PostMapping()
    public void sendEmail(@RequestBody Email email) {
        es.sendEmail(email);
    }
    

}
