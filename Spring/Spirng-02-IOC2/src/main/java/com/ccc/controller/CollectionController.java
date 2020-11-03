package com.ccc.controller;

import com.ccc.FactoryBean.MyBean;
import com.ccc.autowired.Employee;
import com.ccc.pojo.Book;
import com.ccc.pojo.Course;
import com.ccc.pojo.Orders;
import com.ccc.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/16 21:08
 */
public class CollectionController {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Student student = context.getBean("student", Student.class);
        student.test();
    }

    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
        Book book1=context.getBean("book",Book.class);
        Book book2=context.getBean("book",Book.class);
        System.out.println(book1);
        System.out.println(book2);
        //book.test();
    }

     @Test
    public void test3(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean3.xml");
         Course course=context.getBean("myBean", Course.class);
         System.out.println(course);
     }

     @Test
    public void test4(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean4.xml");
         Orders orders=context.getBean("orders",Orders.class);
         System.out.println(orders);

         //手动让bean实例销毁
         ((ClassPathXmlApplicationContext) context).close();

     }

     @Test
    public void test5(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean5.xml");
         Employee employee=context.getBean("employee",Employee.class);
         System.out.println(employee);

     }
}
