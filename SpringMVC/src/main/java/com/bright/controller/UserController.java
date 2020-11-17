package com.bright.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 徐亮亮
 * @since 2020/11/17
 */
@Controller
public class UserController {

    @RequestMapping("/quick")
    public String save() {
        System.out.println("Controller save is running...");
        return "success.jsp";
    }
}
