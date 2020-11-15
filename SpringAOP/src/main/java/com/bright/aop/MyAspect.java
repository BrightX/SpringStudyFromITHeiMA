package com.bright.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
public class MyAspect {

    public void before() {
        System.out.println("前置增强...");
    }

    public void afterReturning() {
        System.out.println("后置增强...");
    }

    // Proceeding JoinPoint 正在执行的连接点 ==> 切点
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置增强...");
        // 切点方法执行
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕后置增强...");
        return o;
    }

    public void afterThrowing(){
        System.out.println("异常抛出增强...");
    }

    public void after() {
        System.out.println("最终增强...");
    }
}
