package com.demo.resttemplate.controller;

import com.demo.resttemplate.dto.User;
import com.demo.resttemplate.dto.UserResponse;
import com.demo.resttemplate.api.UserApiService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {


    @Autowired
    private UserApiService userService;


    @GetMapping("/users")
    public ResponseEntity<UserResponse> getUser() {
        return new ResponseEntity<>(new UserResponse("Success","rest template service",userService.getUsers()), HttpStatus.OK);
    }

    @PostMapping("/user")
    public ResponseEntity<UserResponse> createUser(@RequestBody User user) {
        userService.createUser(user);
        return new ResponseEntity<>(new UserResponse("Success","rest template service"),HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<UserResponse> deleteUser(@PathVariable("id") String id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(new UserResponse("Success"),HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<UserResponse> updateUser(@PathVariable("id") String id,@RequestBody User user) {
        user.setUserId(id);
        userService.updateUser(user);
        return new ResponseEntity<>(new UserResponse("Success"),HttpStatus.OK);
    }
}
