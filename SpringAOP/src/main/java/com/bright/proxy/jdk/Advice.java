package com.bright.proxy.jdk;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
public class Advice {
    public void before() {
        System.out.println("前置增强...");
    }
    public void afterRunning() {
        System.out.println("后置增强...");
    }
}
