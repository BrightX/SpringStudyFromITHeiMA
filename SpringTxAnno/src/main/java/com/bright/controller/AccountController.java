package com.bright.controller;

import com.bright.config.SpringConfiguration;
import com.bright.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 徐亮亮
 * @since 2020/11/16
 */
public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        AccountService accountService = app.getBean(AccountService.class);

        accountService.transfer("Alex", "Tom", 200);
    }
}
