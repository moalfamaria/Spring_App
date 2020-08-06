package demo.persistence;

import demo.domain.Message;
import demo.domain.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DbSeeder implements CommandLineRunner {


    private UserRepository userRepository;
    private MessageRepository messageRepository;

    public DbSeeder(UserRepository userRepository,MessageRepository messageRepository) {
        this.userRepository = userRepository;
        this.messageRepository= messageRepository;
    }

    @Override
    public void run(String... args) throws Exception {
       User user1 = new User(1,"suliman","parola");
       User user2 = new User(2,"moalfa","parola");
       Message message1 = new Message(3,new Date(2020,01,01), "buna",1);
       Message message2 = new Message(4,new Date(1997,01,01), "pa",2);

       List<User> users = new ArrayList<>();
       users.add(user1);
       users.add(user2);

        List<Message> messages = new ArrayList<>();
        messages.add(message1);
        messages.add(message2);

       this.userRepository.save(user1);
       this.userRepository.save(user2);
       this.messageRepository.save(message1);
       this.messageRepository.save(message2);
    }
}
