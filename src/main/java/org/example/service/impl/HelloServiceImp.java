package org.example.service.impl;

import org.example.service.HelloService;

public class HelloServiceImp implements HelloService {
    @Override
    public String sayHello(String msg){
        return msg+", welcome to web";
    }
}
