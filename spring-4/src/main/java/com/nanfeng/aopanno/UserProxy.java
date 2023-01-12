package com.nanfeng.aopanno;


import org.springframework.stereotype.Component;

@Component
public class UserProxy {


    //前置通知
    public void before() {
        System.out.println("before-----");
    }
}
