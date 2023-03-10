package com.example.springtest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringtestApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringtestApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringtestApplication.class, args);
        System.out.println("Spring Core Version:- " + SpringVersion.getVersion());
    }

    public void init(){
        log.info("Starting up");
    }

}
