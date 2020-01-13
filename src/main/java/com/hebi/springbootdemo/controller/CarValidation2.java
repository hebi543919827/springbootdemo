package com.hebi.springbootdemo.controller;

import com.hebi.springbootdemo.bean.Car;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarValidation2 {
    @RequestMapping("/carvalid2")
    public String getcarvalidation4(@Validated Car car, BindingResult bindingResult) {
        if (bindingResult.hasErrors()){
            System.out.println("11aasasas1sadsadsa");
            return bindingResult.getFieldError().getDefaultMessage();
        }
        return car.toString();
    }

    @InitBinder
    private void initBinder(WebDataBinder webDataBinder){
        webDataBinder.addCustomFormatter(new DateFormatter("yyyy-MM-dd HH:mm:ss"));
    }
}
