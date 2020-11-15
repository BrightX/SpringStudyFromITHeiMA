package com.bright.aop;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        // int a = 1/0;
        System.out.println("save in running...");
    }
}
