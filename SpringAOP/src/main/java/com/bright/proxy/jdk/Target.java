package com.bright.proxy.jdk;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save in running...");
    }
}
