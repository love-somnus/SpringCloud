package com.somnus.springcloud.hystrix;

import org.springframework.stereotype.Component;

import com.somnus.springcloud.service.AdminService;

@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}