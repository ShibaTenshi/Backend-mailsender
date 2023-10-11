package ku.cs.backendmailsender.service;

import jakarta.mail.internet.InternetAddress;
import ku.cs.backendmailsender.model.Otp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class MailSendService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMailOtp(Otp mail) throws MailException {
        MimeMessagePreparator preparator = (mimeMessage) -> {
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
            helper.setFrom(new InternetAddress("no-reply@doksakura.com", "ShibaQueue Team"));
            helper.setTo(mail.getEmail());
            helper.setSubject("Confirm code for ShibaQueue");

            helper.setText("Hello " + mail.getUsername() +
                    ",\n\nYou can copy this code for your confirmation." +
                    "\n\n" + mail.getOtp() +
                    "\n\nThis code will expire after 10 minutes or if you request a new code. \n" +
                    "Thanks, \n" +
                    "\n" +
                    "ShibaQueue Team ");
        };
        mailSender.send(preparator);
    }
}
