package com.ccc.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 14:58
 */
//增强的类
    @Component
    @Aspect
public class UserProxy {
    //相同切入点抽取
    @Pointcut(value = "execution(* com.ccc.aop.User.add(..))")
    public void point(){}

    //前置通知
    @Before(value = "point()")
    public void before() {
        System.out.println("before......");
    }

    //后置通知（返回通知}
    @After(value = "point()")
    public void after(){
        System.out.println("after..........");
    }

    //异常通知
    @AfterThrowing(value = "point()")
    public void afterThrowing(){
        System.out.println("afterThrowing..........");
    }
    //环绕通知
    @Around(value = "point()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws
            Throwable {
        System.out.println("环绕之前.........");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }

}
