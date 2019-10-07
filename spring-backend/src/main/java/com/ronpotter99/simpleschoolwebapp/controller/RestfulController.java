package com.ronpotter99.simpleschoolwebapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulController {

    @GetMapping("/test")
    public String test() {
        return "Test Successful";
    }
}
