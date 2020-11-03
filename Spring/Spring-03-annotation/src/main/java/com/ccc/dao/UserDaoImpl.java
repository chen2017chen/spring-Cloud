package com.ccc.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/19 22:22
 */

@Repository
public class UserDaoImpl implements UserDao {
    public void add() {
        System.out.println("UserDao add");
    }
}
