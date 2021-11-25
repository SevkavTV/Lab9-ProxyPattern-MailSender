package mail_sender;

import java.io.IOException;

public class MailSender {
    public static void sendMail(MailInfo info) throws IOException {
        System.out.println("Text: " + info.getMailText());
        System.out.println("Client email: " + info.getEmail());
    }
}
