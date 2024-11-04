package com.demo.resttemplate.api.dto;

import com.demo.resttemplate.dto.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserApi {

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private List<User> users;
}
