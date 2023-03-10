package com.ioc.controller;

import com.ioc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    public UserService userService;




    public UserService getUserService() {
        return userService;
    }


    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public UserController(){}

    public double sum(double num1, double num2){
        return   userService.sum(num1, num2);
    }



}
