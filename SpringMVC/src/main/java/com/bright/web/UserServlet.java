package com.bright.web;

import com.bright.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 徐亮亮
 * @since 2020/11/17
 */
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        ServletContext servletContext = this.getServletContext();

        // ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // ApplicationContext app = (ApplicationContext) servletContext.getAttribute("app");
        // ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        ApplicationContext app = WebApplicationContextUtils.getWebApplicationContext(servletContext);

        UserService userService = app.getBean(UserService.class);
        userService.save();
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("Hello World<br>");
        resp.getWriter().write("你好呀，朋友");
    }
}
