package com.bright.dao.impl;

import com.bright.dao.UserDao;

/**
 * @author 徐亮亮
 * @since 2020/11/13
 */
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl 创建...");
    }

    public void init() {
        System.out.println("初始化方法...");
    }

    public void destroy() {
        System.out.println("销毁方法...");
    }

    public void save() {
        System.out.println("save is running...");
    }
}
