package com.ifi.serviceB.service.impl;

import com.ifi.codegen.server.model.User;
import com.ifi.serviceB.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    private final Map<Long, User> users = new HashMap<>();

    @Override
    public ResponseEntity<User> saveUser(User user) {
        if (user == null) {
            return ResponseEntity.badRequest().build();
        }

        users.put(user.getId(), user);

        return new ResponseEntity<>(user, HttpStatus.OK) ;
    }

    @Override
    public ResponseEntity<User> getUserDetailsById(Long userId) {

        if (userId == null) {
            return ResponseEntity.badRequest().build();
        }
        User user = null;
        try {
            user = users.get(userId);
        } catch (Exception e){
            return ResponseEntity.notFound().build();
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
