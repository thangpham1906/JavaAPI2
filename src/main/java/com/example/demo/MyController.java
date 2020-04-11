package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @RequestMapping("/")
    public String home(){
        return "Welcom to my home";
    }
    @RequestMapping("/test")
    public String test(){
        return "This is a test";
    }
}
