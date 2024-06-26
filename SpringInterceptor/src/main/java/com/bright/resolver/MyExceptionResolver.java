package com.bright.resolver;

import com.bright.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
public class MyExceptionResolver implements HandlerExceptionResolver {
    /**
     * @param ex Exception 异常对象
     * @return ModelAndView 跳转到错误异常信息页面
     */
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof MyException) {
            modelAndView.addObject("info", "自定义异常");
        } else if (ex instanceof ClassCastException) {
            modelAndView.addObject("info", "类型转换异常");
        } else {
            modelAndView.addObject("info", "其他异常");
        }

        modelAndView.setViewName("error4");
        return modelAndView;
    }
}
