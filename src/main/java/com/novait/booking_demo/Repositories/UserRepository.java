package com.novait.booking_demo.Repositories;

import com.novait.booking_demo.Models.Entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {}
