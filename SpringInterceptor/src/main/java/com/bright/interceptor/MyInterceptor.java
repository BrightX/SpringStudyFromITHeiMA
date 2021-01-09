package com.bright.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 目标方法执行之前执行
     *
     * @return bool ture: 放行; false: 不放行
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException {
        System.out.println("preHandle...");
        String param = request.getParameter("param");
        if ("yes".equals(param)) {
            System.out.println("放行");
            return true;
        }
        request.getRequestDispatcher("error.jsp").forward(request, response);
        return false;
    }

    /**
     * 目标方法执行之后，视图对象返回之前执行
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        modelAndView.addObject("name", "Cat");
        System.out.println("postHandle...");
    }

    /**
     * 在流程执行完毕之后执行
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("afterCompletion...");
    }
}
