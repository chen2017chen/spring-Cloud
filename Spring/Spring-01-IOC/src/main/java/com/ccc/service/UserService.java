package com.ccc.service;

import com.ccc.dao.UserDao;
import com.ccc.dao.UserDaoImpl;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/16 18:08
 */
public class UserService {



    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    //通过set方法进行注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    public void add(){
        System.out.println("add................");
        userDao.update();
    }



}
