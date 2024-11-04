package com.demo.resttemplate.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

    @Getter
    @Setter
    @Value("${api.user.endpoint}")
    private String UserEndpoint;
}
