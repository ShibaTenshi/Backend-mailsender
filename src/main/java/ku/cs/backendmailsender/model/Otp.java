package ku.cs.backendmailsender.model;

import lombok.Data;

@Data
public class Otp {
    private String email;
    private String username;
    private String otp;
}
