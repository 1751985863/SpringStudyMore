package com.nanfeng.test;


import com.nanfeng.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@SpringJUnitConfig(locations = {"classpath:bean11.xml"})
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.accountMoney();
    }
}
