package com.demo.resttemplate.service;

import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.dto.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void createUser(User user);
}
