package com.nanfeng.service;

import com.nanfeng.dao.UserDao;
import com.nanfeng.dao.UserDaoImpl;

public class UserService {

//创建UserDao类型属性，生成set方法

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userService add");

        userDao.update();
    }
}
