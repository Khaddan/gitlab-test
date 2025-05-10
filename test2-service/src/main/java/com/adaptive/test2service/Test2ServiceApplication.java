package com.adaptive.test2service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Test2ServiceApplication {

    @GetMapping("/api/message2")
    public String getMessage() {
        return "Hello team Adaptive-It..!!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Test2ServiceApplication.class, args);
    }

}
