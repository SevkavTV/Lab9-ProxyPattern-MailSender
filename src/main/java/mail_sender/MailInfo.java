package mail_sender;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.util.HashMap;

@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getMailText() throws IOException {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();

        templates.put("%NAME%", client.getName());
        templates.put("%AGE%", String.valueOf(Integer.valueOf(client.getAge())));

        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }

        return text;
    }

    public String getEmail() {
        return client.getEmail();
    }
}
