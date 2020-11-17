package com.bright.service.impl;

import com.bright.dao.UserDao;
import com.bright.service.UserService;

/**
 * @author 徐亮亮
 * @since 2020/11/17
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
