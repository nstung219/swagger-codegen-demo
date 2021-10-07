package com.ifi.codegen.service.impl;

import com.ifi.codegen.repo.UserRepo;
import com.ifi.codegen.service.UserService;
import com.ifi.swagger.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public ResponseEntity<User> findUserDetailsById(Long userId) {
        // verify userId
        if (userId == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        // find user, return notfound or found user
        User user = UserRepo.findUserDetailsById(userId);
        if (user == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> saveUser(User user) {
        // verify user availability
        User tmp = UserRepo.findUserDetailsById(user.getId());

        // return conflict if user id exists
        if (tmp != null){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
        UserRepo.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
}
