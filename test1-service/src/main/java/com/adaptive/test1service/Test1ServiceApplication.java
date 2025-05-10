package com.adaptive.test1service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Test1ServiceApplication {

    @GetMapping("/mess")
    public String getMessage() {
        return "Welcome to Adaptive-It..!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Test1ServiceApplication.class, args);
    }

}
