package com.demo.resttemplate.controller;

import com.demo.resttemplate.dto.UserResponse;
import com.demo.resttemplate.api.UserApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @Autowired
    private UserApiService userService;


    @GetMapping("/users")
    public ResponseEntity<UserResponse> getUser() {
        return new ResponseEntity<>(new UserResponse("Success",userService.getUsers()), HttpStatus.OK);
    }


}
