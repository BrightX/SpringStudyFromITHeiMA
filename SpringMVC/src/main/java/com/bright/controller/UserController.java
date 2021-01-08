package com.bright.controller;

import com.bright.domain.User;
import com.bright.domain.VO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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

    // === === === === === === === === === === === === === === === === === === === ===

    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(String username, Integer age) {
        System.out.println("username = " + username);
        System.out.println("age = " + age);
    }

    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(User user) {
        System.out.println("user = " + user);
    }

    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(String[] strs) {
        System.out.println("strs = " + Arrays.toString(strs));
    }

    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(VO vo) {
        System.out.println("vo = " + vo);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) {
        System.out.println("userList = " + userList);
    }

    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam(value = "name", required = false, defaultValue = "default user") String username) {
        System.out.println("username = " + username);
    }

    @RequestMapping("/quick17/{username}")
    @ResponseBody
    public void save17(@PathVariable(value = "username") String username) {
        System.out.println("username = " + username);
    }

    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(Date date) {
        System.out.println("date = " + date);
    }

    @RequestMapping("/quick19")
    @ResponseBody
    public void save19(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        System.out.println("request = " + request);
        System.out.println("response = " + response);
        System.out.println("session = " + session);
    }

    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(@RequestHeader("User-Agent") String userAgent) {
        System.out.println("userAgent = " + userAgent);
    }

    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(@CookieValue("JSESSIONID") String jSessionId) {
        System.out.println("jSessionId = " + jSessionId);
    }

    @RequestMapping("/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile upload) throws IOException {
        System.out.println("username = " + username);
        // 获取文件名称
        String filename = upload.getOriginalFilename();
        // 保存文件
        upload.transferTo(new File("D:\\temp\\" + filename));
    }

}
