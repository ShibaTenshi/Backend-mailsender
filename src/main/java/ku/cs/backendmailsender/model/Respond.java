package ku.cs.backendmailsender.model;

import ku.cs.backendmailsender.common.RespondCode;
import lombok.Data;

@Data
public class Respond {
    RespondCode status;
    String value;

    public Respond(RespondCode status) {
        this.status = status;
        value = "";
    }

    public Respond(RespondCode status, String value) {
        this.status = status;
        this.value = value;
    }
}
