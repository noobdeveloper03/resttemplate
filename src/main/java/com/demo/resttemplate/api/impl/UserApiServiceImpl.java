package com.demo.resttemplate.api.impl;

import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.api.UserApiService;
import com.demo.resttemplate.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserApiServiceImpl implements UserApiService {

    @Autowired
    private RestTemplate restTemplate;

    private Logger logger = LoggerFactory.getLogger(UserApiServiceImpl.class);

    @Autowired
    private Environment env;

    @Override
    public List<User> getUsers() {
        System.out.println("Rest API Endpoint = " + env.getProperty("api.user.endpoint"));
        logger.info("Rest API Endpoint = {}",env.getProperty("api.user.endpoint"));
        UserApi userApi = restTemplate.getForObject(env.getProperty("api.user.endpoint"), UserApi.class);
        return userApi.getUsers();
    }
}
