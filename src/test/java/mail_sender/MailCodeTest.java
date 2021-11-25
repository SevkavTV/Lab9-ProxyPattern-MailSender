package mail_sender;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MailCodeTest {
    MailCode mailCode;
    @BeforeEach
    void setUp() {
        mailCode = MailCode.HAPPY_BIRTHDAY;
    }

    @Test
    void generateText() throws IOException {
        assertEquals(mailCode.generateText(), "Happy Birthday, %NAME%!");
    }
}