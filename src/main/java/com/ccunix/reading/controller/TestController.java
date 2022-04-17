package com.ccunix.reading.controller;

import com.ccunix.reading.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "test reading";
    }

    @GetMapping("/testThyme")
    public String testThyme(){
        return "test";
    }

    @GetMapping("/testServe")
    @ResponseBody
    public String testServe(){
        return testService.test();
    }

    @GetMapping("/testMapper")
    @ResponseBody
    public String testMapper(){
        return testService.testMapper();
    }
}
