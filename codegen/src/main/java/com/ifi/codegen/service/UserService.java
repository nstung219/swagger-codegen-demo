package com.ifi.codegen.service;

import com.ifi.swagger.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    ResponseEntity<User> findUserDetailsById(Long userId);

    ResponseEntity<User> saveUser(User user);
}
