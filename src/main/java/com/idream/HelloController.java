package com.idream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String home() {
    	logger.debug("Entering hello() method");
    	logger.info("Home endpoint accessed - serving welcome page");
        return "<h1>Welcome to Spring Boot! App running successfully.</h1>";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World from Spring Boot!";
    }

}