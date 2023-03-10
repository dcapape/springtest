package com.example.springtest.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;

// Map the URL /test to this controller
@RestController
@RequestMapping("/test")
public class TestController implements Serializable {

    // Map the URL /test/hello to this method
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
