package com.nanfeng.service;

import com.nanfeng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    //不需要添加set方法
/*    @Qualifier(value = "userDaoImpl1")
    @Autowired
    private UserDao userDao;*/

    @Value(value = "abc")
    private String name;

    @Resource(name = "userDaoImpl1") // 根据类型注入 或则 根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("name" + name);
        userDao.add();
    }
}
