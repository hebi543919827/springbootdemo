package com.hebi.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/getName")
    public String getName(){
        return "hello,springBoot!";
    }

}
