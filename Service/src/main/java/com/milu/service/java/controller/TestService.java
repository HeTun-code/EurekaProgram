package com.milu.service.java.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestService {

    @PostMapping("/testService")
    public String testC(@RequestBody TestDTO s) {
        s.setValue("ttttt");
        return s.toString();
    }

}
