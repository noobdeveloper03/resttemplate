package com.demo.resttemplate.service.impl;

import com.demo.resttemplate.api.UserApiService;
import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.dto.User;
import com.demo.resttemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserApiService userApiService;

    public List<User> getUsers(){
        return userApiService.getUsers();
    }
}
