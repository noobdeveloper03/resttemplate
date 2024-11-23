package com.demo.resttemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ResttemplateApplication {

	private static final Logger logger = LoggerFactory.getLogger(ResttemplateApplication.class);


	public static void main(String[] args) {
		logger.info("This is an INFO log message");
		logger.debug("This is a DEBUG log message");
		SpringApplication.run(ResttemplateApplication.class, args);
	}

}
