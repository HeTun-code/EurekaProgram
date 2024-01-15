package com.milu.application.java.controller;

import com.milu.application.java.fign.ItestFeignService;
import com.milu.application.java.fign.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/application")
public class TestController{
    @Autowired
    private ItestFeignService itestService;

    @PostMapping(value="/testController")
    @ResponseBody
    public String testC() {
        TestDTO build = TestDTO.builder().id("controller").value("test1").build();
        String s = itestService.testC(build);
        return s;
    }
}
