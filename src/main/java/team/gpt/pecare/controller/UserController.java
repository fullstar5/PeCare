package team.gpt.pecare.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import team.gpt.pecare.service.UserService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@EnableWebMvc
@RequestMapping("/user")
public class UserController {

    static final Logger logger = LogManager.getLogger(UserController.class);

    @Resource
    private UserService userService;


//    @GetMapping("/{userId}")
//    public String getUserByID(@PathVariable("userId") String userId) throws JsonProcessingException {
//        logger.info("entered getUserByID method, userId = " + userId);
//        User user = new User(userId, "neo", "neo@matrix.com");
//        return new ObjectMapper().writeValueAsString(user);
//    }
//
//    @GetMapping("/getAll")
//    public String getUser() throws JsonProcessingException {
//        logger.info("entered getUser method");
//        List<User> users = new ArrayList<>();
//        users.add(new User("001", "apoch", "123@matrix.com"));
//        users.add(new User("002", "switch", "13233@matrix.com"));
//        users.add(new User("003", "trinity", "1sdf3@matrix.com"));
//        users.add(new User("004", "neo", "neo@matrix.com"));
//        return new ObjectMapper().writeValueAsString(users);
//    }

}
