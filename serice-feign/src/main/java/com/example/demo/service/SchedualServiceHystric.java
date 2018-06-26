package com.example.demo.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements  SchedualService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name;
    }
}
