package com.shuiliandong.demo.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {


    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

}
