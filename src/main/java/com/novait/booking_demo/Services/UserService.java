package com.novait.booking_demo.Services;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.novait.booking_demo.Models.DTO.EmployeeDTO;
import com.novait.booking_demo.Models.DTO.UserDTO;
import com.novait.booking_demo.Models.Entities.User;
import com.novait.booking_demo.Models.Mappers.EmployeeMapper;
import com.novait.booking_demo.Models.Mappers.UserMapper;
import com.novait.booking_demo.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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

    public UserDTO getUser(Long id) {
        return UserMapper.INSTANCE.userToUserDTO(userRepository.findOne(id)) ;
    }

    public boolean createNewUser(User user) {

            if (user.getCreationTime() == null) {
                user.setCreationTime(new Timestamp(System.currentTimeMillis()));
            }
            userRepository.save(user);
            return true;

    }

    public boolean changeUserPass(Long id, String pass) {
        // User u = getActiveUser();
        User u = userRepository.findOne(id);

        if (u != null) {
            u.setPassword(pass);
            return (userRepository.save(u) != null);
        }
        else {
            throw new HttpClientErrorException(HttpStatus.NOT_FOUND);
        }
    }

    public void deleteUser(Long id) {

        User u = userRepository.findOne(id);
        //unsafe?
        userRepository.delete(u);
    }
}
