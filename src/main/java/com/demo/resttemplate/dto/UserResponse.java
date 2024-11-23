package com.demo.resttemplate.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class UserResponse {

    @Getter
    @Setter
    private String message;

    @Getter
    @Setter
    private String service;


    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<User> users;

    public UserResponse(String message, List<User> users) {
        this.message = message;
        this.users = users;
    }

    public UserResponse(String message, String service) {
        this.message = message;
        this.service = service;
    }

    public UserResponse(String message) {
        this.message = message;
    }

    public UserResponse(String message,String service, List<User> users) {
        this.message = message;
        this.users = users;
        this.service = service;
    }
}
