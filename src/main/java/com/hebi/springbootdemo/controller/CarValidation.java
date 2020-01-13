package com.hebi.springbootdemo.controller;

import com.hebi.springbootdemo.bean.Car;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarValidation {
    @RequestMapping("/getcarvalidation1")
    public Car getcarvalidation1(@RequestBody @Validated Car car) {
        return car;
    }
}
