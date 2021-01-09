package com.bright.controller;

import com.bright.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
@Controller
public class ErrorDemoController {
    @RequestMapping("show")
    public void show() {
        int a = 1 / 0;
        System.out.println("异常");
    }

    @RequestMapping("show1")
    public void show1() {
        System.out.println("类型转换异常");
        Object a = new Integer(0);
        String str = (String) a;
    }

    @RequestMapping("show2")
    public void show2() {
        String str = "01ssa";
        System.out.println("数字格式异常");
        Integer a = Integer.valueOf(str);
    }

    @RequestMapping("show3")
    public void show3() throws MyException {
        System.out.println("自定义异常");
        throw new MyException();
    }
}
