package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    MailInfo info;

    @BeforeEach
    void setUp() {
        Client client = new Client("Vsevolod", 18, Gender.MALE, "seva.archakov@gmail.com");
        info = new MailInfo(client, MailCode.HAPPY_BIRTHDAY);
    }

    @Test
    void getMailText() throws IOException {
        assertEquals(info.getMailText(), "Happy Birthday, Vsevolod!");
    }

    @Test
    void getEmail() {
        assertEquals(info.getEmail(), "seva.archakov@gmail.com");
    }
}