package com.bright.factory;

import com.bright.dao.UserDao;
import com.bright.dao.impl.UserDaoImpl;

/**
 * @author 徐亮亮
 * @since 2020/11/13
 */
public class StaticFactory {
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
