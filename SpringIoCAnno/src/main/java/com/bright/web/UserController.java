package com.bright.web;

import com.bright.config.SpringConfiguration;
import com.bright.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 徐亮亮
 * @since 2020/11/14
 */
public class UserController {
    public static void main(String[] args) {
        // ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
