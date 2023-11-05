package ku.cs.backendmailsender.controller;

import ku.cs.backendmailsender.model.MailDeleteRestaurantBody;
import ku.cs.backendmailsender.model.MailNewRestaurantBody;
import ku.cs.backendmailsender.model.Otp;
import ku.cs.backendmailsender.service.MailSendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    MailSendService service;

    @PostMapping("/sendotp")
    public void sendOtp(@RequestBody Otp otp) {
        service.sendMailOtp(otp);
    }

    @PostMapping("/sendDelete")
    public void sendDelete(@RequestBody MailDeleteRestaurantBody mailDeleteRestaurantBody) {
        service.sendMailDelete(mailDeleteRestaurantBody);
    }

    @PostMapping("/sendNew")
    public void sendNew(@RequestBody MailNewRestaurantBody mailNewRestaurantBody) {
        service.sendMailNew(mailNewRestaurantBody);
    }
}