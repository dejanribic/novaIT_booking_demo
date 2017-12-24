package com.novait.booking_demo.Controllers;

import java.util.List;
import com.novait.booking_demo.Services.UserService;
import com.novait.booking_demo.Beans.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    /*
    Avoid (too much?) Field DI!

    @Autowired
    UserService userService;
     */

    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    private final UserService userService;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/users")
    public List<User> getAllUsers() {

        logger.info("\nTest: getting all users!!\t");

        return userService.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/users")
    public User addUser(@RequestBody User user) {
        userService.createNewUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/users/{id}")
    public User updateUserEmail(@RequestBody String email, @PathVariable Long id) {
        userService.changeUserEmail(id, email);
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/users/{id}")
    public User deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return userService.getUser(id);
    }
}
