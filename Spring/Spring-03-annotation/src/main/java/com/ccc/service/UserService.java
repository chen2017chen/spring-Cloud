package com.ccc.service;

import com.ccc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jws.soap.SOAPBinding;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/19 20:15
 */
//在注解中value属性值可以省略不写
//默认值是类名称，首字母小写
//例如：UserService变成userService
//@Component(value = "userService")
@Service
//相当于在bean中的<bean id="userService" class="">
public class UserService {
    //定义dao类型属性
    //不需要添加set方法
    //@Autowired//根据类型进行注入
    //@Qualifier(value = "userDaoImpl")//根据名称进行注入
    //private UserDao userDao;
    @Value(value = "abc")
    private String name;
    //@Resource//根据类型进行注入
    @Resource(name = "userDaoImpl")//根据名称进行注入
     private UserDao userDao;
    public void add(){
        System.out.println("service  add..............."+name);
        userDao.add();
    }
}
