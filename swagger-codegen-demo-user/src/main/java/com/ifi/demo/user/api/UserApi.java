/**
 * NOTE: This class is auto generated by the swagger code generator program (2.2.3).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ifi.demo.user.api;

import com.ifi.demo.user.model.User;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-10-06T19:56:20.118+07:00")

@Api(value = "user", description = "the user API")
public interface UserApi {

    @ApiOperation(value = "Find user by ID", notes = "Returns a single User", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid User ID supplied", response = Void.class),
        @ApiResponse(code = 404, message = "User not found", response = Void.class) })
    
    @RequestMapping(value = "/user/{userId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUserDetailsById(@ApiParam(value = "ID of User to return",required=true ) @PathVariable("userId") Long userId);


    @ApiOperation(value = "Save user", notes = "Save user and returns a single User", response = User.class, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = User.class),
        @ApiResponse(code = 400, message = "Invalid User supplied", response = Void.class),
        @ApiResponse(code = 409, message = "User id not unique", response = Void.class) })
    
    @RequestMapping(value = "/user",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> saveUser(@ApiParam(value = "User"  )  @Valid @RequestBody User user);

}
