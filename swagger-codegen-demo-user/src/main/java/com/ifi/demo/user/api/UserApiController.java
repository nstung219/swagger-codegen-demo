package com.ifi.demo.user.api;

import com.ifi.demo.user.model.User;

import com.ifi.demo.user.repo.UserRepo;
import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-06T19:56:20.118+07:00")

@Controller
public class UserApiController implements UserApi {

    public ResponseEntity<User> getUserDetailsById(@ApiParam(value = "ID of User to return",required=true ) @PathVariable("userId") Long userId) {

        // verify userId
        if (userId == null){
            return new ResponseEntity<User>(HttpStatus.BAD_REQUEST);
        }

        // find user, return notfound or found user
        User user = UserRepo.findUserById(userId);
        if (user == null){
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<User>(user, HttpStatus.OK);
    }

    public ResponseEntity<User> saveUser(@ApiParam(value = "User"  )  @Valid @RequestBody User user) {
        // verify user availability
        User tmp = UserRepo.findUserById(user.getId());

        // return conflict if user id exists
        if (tmp != null){
            return new ResponseEntity<User>(HttpStatus.CONFLICT);
        }

        return new ResponseEntity<User>(UserRepo.saveUser(user), HttpStatus.OK);
    }

}
