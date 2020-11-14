package com.bright.dao.impl;

import com.bright.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @author 徐亮亮
 * @since 2020/11/14
 */
// <bean id="userDao" class="com.bright.dao.impl.UserDaoImpl"/>
@Component("userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("save is running...");
    }
}
