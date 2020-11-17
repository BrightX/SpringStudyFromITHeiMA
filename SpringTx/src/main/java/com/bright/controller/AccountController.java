package com.bright.controller;

import com.bright.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        AccountService accountService = app.getBean(AccountService.class);

        accountService.transfer("Alex", "Tom", 200);
    }
}
