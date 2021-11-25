package mail_sender;

import java.io.IOException;
import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos;

    public MailBox() {
        infos = new ArrayList<>();
    }

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws IOException {
        for(MailInfo info: infos) {
            MailSender.sendMail(info);
        }
    }
}
