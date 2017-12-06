package com.novait.booking_demo.Services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.novait.booking_demo.Beans.User;
import com.novait.booking_demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    public boolean createNewUser(User user) {
        if (user.fieldCheck()) {
            if (user.getCreationTime() == null) {
                user.setCreationTime(new Timestamp(System.currentTimeMillis()));
            }
            userRepository.save(user);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean changeUserEmail(Long id, String email) {
        // User u = getActiveUser();
        User u = userRepository.findOne(id);
        u.setEmail(email);
        return (userRepository.save(u) != null);
    }

    // No security - hash/salt/pepper etc.
    public boolean changeUserPassword(Long id, String pass) {
        User u = userRepository.findOne(id);
        u.setPassword(pass);
        return (userRepository.save(u) != null);
    }

    public void deleteUser(Long id) {

        User u = userRepository.findOne(id);
        //unsafe?
        userRepository.delete(u);
    }
}
