package mail_sender;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Client {
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String email;

    public Client(String name, int age, Gender sex, String email) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.email = email;
        id = ClientIDGenerator.generateId();
    }

    private static class ClientIDGenerator {
        private static int counter = 0;

        public static int generateId(){
            counter++;
            return counter;
        }
    }
}
