package com.wdjr.controller;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController implements BeanNameAware {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName invoke");
    }
}
