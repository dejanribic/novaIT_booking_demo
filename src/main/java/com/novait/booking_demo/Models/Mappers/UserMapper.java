package com.novait.booking_demo.Models.Mappers;

import com.novait.booking_demo.Models.DTO.UserDTO;
import com.novait.booking_demo.Models.Entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper{

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "password", target = "userPass")
    @Mapping(source = "email", target = "userEmail")
    @Mapping(source = "name", target = "userName")
    UserDTO userToUserDTO(User user);
}
