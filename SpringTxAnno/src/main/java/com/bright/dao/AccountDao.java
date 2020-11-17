package com.bright.dao;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
public interface AccountDao {
    public void out(String outMan, double money);
    public void in(String inMan, double money);
}
