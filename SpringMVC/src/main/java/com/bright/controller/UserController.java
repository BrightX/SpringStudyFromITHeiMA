package com.bright.controller;

import com.bright.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 徐亮亮
 * @since 2020/11/17
 */
@Controller
@RequestMapping("/user")
public class UserController {

    // @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})
    @RequestMapping(value = "/quick")
    public String save() {
        System.out.println("Controller save is running...");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2() {
        /*
          Model: 模型  封装数据
          View: 视图   展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", "Bright Xu");
        // 设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        modelAndView.addObject("username", "Tom");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "Jerry");
        return "success";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "Maria");
        return "success";
    }

    // === === === === === === === === === === === === === === === === === === === ===

    @RequestMapping("/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.getWriter().write("{\"username\": \"Kang kang\"}");
    }

    @RequestMapping("/quick7")
    @ResponseBody  // 告知SpringMVC框架不进行试图跳转 直接进行数据响应
    public String save7() {
        return "{\"username\": \"AdminTest001\"}";
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() {
        return "{\"username\": \"Li Si\", \"age\": 19}";
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws JsonProcessingException {
        User user = new User();
        user.setUsername("Zhang Sa");
        user.setAge(19);
        // 使用JSON转换工具将对象转换成JSON格式的字符串
        JsonMapper jsonMapper = new JsonMapper();
        return jsonMapper.writeValueAsString(user);
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10() {
        User user = new User();
        user.setUsername("李斯");
        user.setAge(19);
        return user;
    }
}
