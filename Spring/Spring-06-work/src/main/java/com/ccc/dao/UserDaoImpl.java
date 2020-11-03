package com.ccc.dao;

import com.ccc.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/27 0:14
 */
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    private User user;
    //多钱
    public void addMoney() {
        String sql="update t_money set money=money-? where username=?";
        Object[]args={user.getId(),user.getUsername(),user.getMoney()};
        int update=jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
    //少钱
    public void reduceMoney() {

    }
}
