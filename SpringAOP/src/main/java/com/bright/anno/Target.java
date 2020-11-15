package com.bright.anno;

import org.springframework.stereotype.Component;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
@Component("target")
public class Target implements TargetInterface {
    @Override
    public void save() {
        // int a = 1/0;
        System.out.println("save in running...");
    }
}
