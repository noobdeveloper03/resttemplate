package com.demo.resttemplate.api.impl;

import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.api.UserApiService;
import com.demo.resttemplate.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserApiServiceImpl implements UserApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<User> getUsers() {
        UserApi userApi = restTemplate.getForObject("http://localhost:8080/users", UserApi.class);
        return userApi.getUsers();
    }
}
