package com.bright.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author 徐亮亮
 * @since 2020/11/17
 */
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        // 上下文初始化
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        // 将Spring的应用上下文对象存储到 ServletContext 域中
        ServletContext servletContext = sce.getServletContext();
        servletContext.setAttribute("app", app);

        // System.out.println("Spring 容器创建完成...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 上下文销毁
    }
}
