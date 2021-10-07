package com.ifi.codegen.api;

import com.ifi.codegen.service.UserService;
import com.ifi.swagger.api.UserApi;
import com.ifi.swagger.model.User;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 *  implements user apis
 */
@RestController
public class UserApiImpl implements UserApi {

    @Autowired
    private UserService userService;

    public ResponseEntity<User> getUserDetailsById(@ApiParam(value = "ID of User to return",required=true ) @PathVariable("userId") Long userId) {
        return userService.findUserDetailsById(userId);
    }

    public ResponseEntity<User> saveUser(@ApiParam(value = "User"  )  @Valid @RequestBody User user) {
        return userService.saveUser(user);
    }
}
