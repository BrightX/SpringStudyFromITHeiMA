package com.bright.dao.impl;

import com.bright.dao.UserDao;
import com.bright.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author 徐亮亮
 * @since 2020/11/13
 */
public class UserDaoImpl implements UserDao {
    private List<String> strList;
    private Map<String, User> userMap;
    private Properties properties;

    private String username;
    private int age;

    public void setStrList(List<String> strList) {
        this.strList = strList;
    }

    public void setUserMap(Map<String, User> userMap) {
        this.userMap = userMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
        System.out.println("username = " + username);
        System.out.println("age = " + age);
        System.out.println(userMap);
        System.out.println(strList);
        System.out.println(properties);
        System.out.println("save is running...");
    }
}
