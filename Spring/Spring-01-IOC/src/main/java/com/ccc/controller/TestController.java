package com.ccc.controller;

import com.ccc.pojo.Employee;
import com.ccc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/16 19:10
 */
public class TestController
{
    @Test
    public void TestBean1() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Employee employee=context.getBean("employee",Employee.class);
        employee.print();
    }

    @Test
    public void TestBean2() {
        //1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        //2.获取配置创建的对象
        UserService userService=context.getBean("userService",UserService.class);
        userService.add();
    }
}
