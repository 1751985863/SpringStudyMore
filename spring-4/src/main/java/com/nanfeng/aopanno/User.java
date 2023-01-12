package com.nanfeng.aopanno;


import org.springframework.stereotype.Component;

@Component
// 被增强的类
public class User {
    public void add() {
        System.out.println("添加");
        int i  = 1 / 0;
    }
}
