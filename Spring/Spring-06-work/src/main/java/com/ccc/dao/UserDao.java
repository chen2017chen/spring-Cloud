package com.ccc.dao;

import org.springframework.stereotype.Component;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/27 0:14
 */
@Component
public interface UserDao {

    public void addMoney();

    public void reduceMoney();
}
