package com.ioc.service.impl;

import com.ioc.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl4 implements UserService {
    @Override
    public double sum(double num1, double num2) {
        System.out.println(("执行了除法！"));
        if (num2==0){
            System.out.println(("运算不成立"));
        }
        return num1/num2;
    }


}
