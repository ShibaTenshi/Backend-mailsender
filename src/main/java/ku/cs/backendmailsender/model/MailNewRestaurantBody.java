package ku.cs.backendmailsender.model;

import lombok.Data;

@Data
public class MailNewRestaurantBody {
    String email;
    String username;
    String restaurantName;
    String password;
}
