package com.ioc.service.impl;

import com.ioc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl1 implements UserService {
    @Override
    public double sum(double num1, double num2) {
        System.out.println(("执行了加法！"));
        return num1+num2;
    }


}
