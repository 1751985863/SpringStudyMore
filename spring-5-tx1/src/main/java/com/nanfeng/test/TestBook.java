package com.nanfeng.test;

import com.nanfeng.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class TestBook {

    @Test
    public void testAccount() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean11.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();

    }

    //函数式风格，交给spring进行管理
    @Test
    public void testAccount2() {
        GenericApplicationContext context = new GenericApplicationContext();
        // 调用ontext的方法对象注册
        context.refresh();
        context.registerBean("user",User.class,()->new User());
        // 获取在spring注册得对象
        // Object user = context.getBean(User.class);
        Object user = context.getBean("user");
        System.out.println(user);
    }

}
