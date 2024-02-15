package com.colak.springsecurityoauth2standaloneresourceserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    // http://localhost:64203/test
    @GetMapping("/test")
    public String helloWorld() {
        return "Hello World";
    }

}
