import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;

@Service
public class EmailService {

    @Value("${SENDGRID_API_KEY}")
    private String sendGridApiKey;

    @Value("${SENDGRID_FROM_EMAIL}")
    private String fromEmail;

    public String sendEmail(String to, String subject, String body) throws IOException {
        Email from = new Email(fromEmail);
        Email recipient = new Email(to);
        Content content = new Content("text/plain", body);
        Mail mail = new Mail(from, subject, recipient, content);

        SendGrid sg = new SendGrid(sendGridApiKey);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            return "Status: " + response.getStatusCode() + " - " + response.getBody();
        } catch (IOException ex) {
            throw ex;
        }
    }
}
