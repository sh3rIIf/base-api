package com.base.baseapi.helloworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    public HelloWorldService() {
    }

    public String sayHello() {
        return "Hello World!";
    }
}
