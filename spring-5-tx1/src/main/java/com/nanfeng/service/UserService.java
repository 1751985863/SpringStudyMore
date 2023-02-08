package com.nanfeng.service;

import com.nanfeng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney() {

        userDao.reduceMoney();

        int i = 1 / 0;

        userDao.addMoney();
    }
}
