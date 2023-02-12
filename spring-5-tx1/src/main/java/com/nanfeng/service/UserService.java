package com.nanfeng.service;

import com.nanfeng.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney() {
        // 1.开启事务

        // 2.业务操作
        try {

        } catch (Exception e) {
            // 事务回滚
        }

        userDao.reduceMoney();

        int i = 1 / 0;

        userDao.addMoney();


    }
}
