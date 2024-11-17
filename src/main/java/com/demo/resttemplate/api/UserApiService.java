package com.demo.resttemplate.api;

import com.demo.resttemplate.api.dto.UserApi;
import com.demo.resttemplate.dto.User;

import java.util.List;

public interface UserApiService {
    List<User> getUsers();

    void createUser(User user);
}
