package com.ccc.dao;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/25 21:45
 */
public class UserDaoImpl implements UserDao {
    public int add(int a, int b) {
        System.out.println("add方法执行了。。。。。。。。。。");
        return a+b;
    }

    public String update(String id) {
        return id;
    }
}
