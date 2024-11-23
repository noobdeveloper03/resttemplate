package com.demo.resttemplate.service.impl;

import com.demo.resttemplate.api.UserApiService;
import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.dto.User;
import com.demo.resttemplate.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserApiService userApiService;

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public List<User> getUsers(){
        logger.info("Getting users");
        return userApiService.getUsers();
    }

    @Override
    public void createUser(User user) {
        logger.info("creating user");
        userApiService.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        logger.info("creating user");
        userApiService.updateUser(user);
    }

    @Override
    public void deleteUser(String userId) {
        logger.info("creating user");
        userApiService.deleteUser(userId);
    }
}
