package demo.web;

import demo.domain.User;
import demo.persistence.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    private UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    //@RequestMapping(value="/users",method = RequestMethod.GET)
    @GetMapping("/users")
    public List<User> getUsers()
    {
        List<User> users= this.userRepository.findAll();
        return users;
    }
}
