package com.bright.domain;

import java.util.List;

/**
 * @author 徐亮亮
 * @since 2021/1/6
 */
public class VO {
    private List<User> userList;

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
