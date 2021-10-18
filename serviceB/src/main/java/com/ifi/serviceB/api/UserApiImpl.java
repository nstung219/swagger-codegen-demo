package com.ifi.serviceB.api;

import com.ifi.codegen.server.api.UserApi;
import com.ifi.codegen.server.model.User;
import com.ifi.serviceB.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiImpl implements UserApi {

    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<User> getUserDetailsById(Long userId) {
        System.out.println("get user detail service called");
        return userService.getUserDetailsById(userId);
    }

    @Override
    public ResponseEntity<User> saveUser(User body) {
        System.out.println("save user service called");
        return userService.saveUser(body);
    }
}