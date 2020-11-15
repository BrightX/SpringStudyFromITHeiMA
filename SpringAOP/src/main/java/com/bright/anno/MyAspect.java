package com.bright.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 徐亮亮
 * @since 2020/11/15
 */
@Component("myAspect")
@Aspect  // 标注当前类时一个切面类
public class MyAspect {

    // 定义切点表达式
    @Pointcut("execution(* com.bright.anno.*.*(..))")
    public void myPoint() {
    }

    @Before("MyAspect.myPoint()")
    public void before() {
        System.out.println("前置增强...");
    }

    @AfterReturning("myPoint()")
    public void afterReturning() {
        System.out.println("后置增强...");
    }

    // Proceeding JoinPoint 正在执行的连接点 ==> 切点
    @Around("execution(* com.bright.anno.*.*(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前置增强...");
        // 切点方法执行
        Object o = proceedingJoinPoint.proceed();
        System.out.println("环绕后置增强...");
        return o;
    }

    @AfterThrowing("execution(* com.bright.anno.*.*(..))")
    public void afterThrowing() {
        System.out.println("异常抛出增强...");
    }

    @After("execution(* com.bright.anno.*.*(..))")
    public void after() {
        System.out.println("最终增强...");
    }
}
