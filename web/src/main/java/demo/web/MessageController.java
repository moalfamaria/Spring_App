package demo.web;


import demo.domain.Message;
import demo.persistence.MessageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {
 private MessageRepository messageRepository;

    public MessageController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }
    //@RequestMapping(value="/users",method = RequestMethod.GET)
    @GetMapping("/messages")
    public List<Message> getMessages()
    {
        List<Message> messages= this.messageRepository.findAll();
        return messages;
    }
}
