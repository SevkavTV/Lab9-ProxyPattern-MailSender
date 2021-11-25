package mail_sender;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), SALE("sale.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws IOException {
        Path path = Path.of(filename);
        return Files.readString(path);
    }
}
