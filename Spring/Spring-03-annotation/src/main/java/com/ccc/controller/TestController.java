package com.ccc.controller;

import com.ccc.service.UserService;
import config.SpringConfig;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/19 20:21
 */
public class TestController {


    @Test
    public void testService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

    @Test
    public void testService2(){
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService=context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }

}
