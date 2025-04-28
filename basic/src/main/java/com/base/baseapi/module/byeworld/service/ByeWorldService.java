package com.base.baseapi.module.byeworld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ByeWorldService {

    @Autowired
    public ByeWorldService() {
    }

    public String sayBye() {
        return "Bye World!";
    }
}
