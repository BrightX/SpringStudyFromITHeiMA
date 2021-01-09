package com.bright.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
@Controller
public class TargetController {

    @RequestMapping("/target")
    public String show(Model model){
        model.addAttribute("name", "Tom");
        System.out.println("目标资源执行……");
        return "show";
    }

}
