package com.novait.booking_demo.Controllers;

import com.novait.booking_demo.Models.DTO.UserDTO;
import com.novait.booking_demo.Models.Entities.User;
import com.novait.booking_demo.Services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpStatusCodeException;

import javax.validation.Valid;
import java.util.List;
import java.util.Random;

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

        Random rand = new Random();

        int n = rand.nextInt(4);
        //System.out.println(n);

        switch (n) {
            case 0:
                logger.info("\nCASE 0: INFO\t");
                logger.info("\nTest: getting all users...\t");
                break;
            case 1:
                logger.info("\nCASE 1: DEBUG\t");
                logger.debug("\nTest: getting all users...\t");
                break;
            case 2:
                logger.info("\nCASE 2: ERROR\t");
                logger.error("\nTest: getting all users...\t");
                break;
            case 3:
                logger.info("\nCASE 3: TRACE\t");
                logger.trace("\nTest: getting all users...\t");
                break;
            case 4:
                logger.info("\nCASE 4: WARN\t");
                logger.warn("\nTest: getting all users...\t");
                break;
            default:
                logger.info("\nCASE DEFAULT: S_OUT\t");
                System.out.println("LOGGING!");
                break;
        }

        return userService.getAllUsers();
    }

    @RequestMapping("/users/{id}")
    public UserDTO getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.POST, value ="/users")
    public User addUser(@RequestBody User user) {
        userService.createNewUser(user);
        return user;
    }

    @RequestMapping(method = RequestMethod.PUT, value ="/users/{id}")
    public UserDTO updateUserPass(@Valid @RequestBody String pass, @PathVariable Long id) {
        try {
            userService.changeUserPass(id, pass);
        } catch (HttpStatusCodeException e) {
            //e.printStackTrace();
            System.out.println("No user with specified ID.");
        }
        return userService.getUser(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value ="/users/{id}")
    public UserDTO deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return userService.getUser(id);
    }
}
