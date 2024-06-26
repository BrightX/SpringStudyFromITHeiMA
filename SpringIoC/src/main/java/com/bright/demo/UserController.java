package com.bright.demo;

import com.bright.service.UserService;
import com.bright.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 徐亮亮
 * @since 2020/11/13
 */
public class UserController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        // ApplicationContext app = new FileSystemXmlApplicationContext("D:\\IdeaProjects\\SpringStudyFromITHeiMA\\SpringIoC\\src\\main\\resources\\applicationContext.xml");
        // UserService userService = (UserService) app.getBean("userService");
        UserService userService = app.getBean(UserService.class);
        userService.save();
    }
}
