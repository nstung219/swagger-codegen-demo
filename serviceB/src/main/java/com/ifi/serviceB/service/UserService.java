package com.ifi.serviceB.service;

import com.ifi.codegen.server.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {
    public ResponseEntity<User> saveUser(User user);
    public ResponseEntity<User> getUserDetailsById(Long userId);
}
