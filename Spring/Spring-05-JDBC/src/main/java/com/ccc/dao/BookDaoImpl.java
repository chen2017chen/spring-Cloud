package com.ccc.dao;

import com.ccc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 16:45
 */

@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void add(Book book) {
        //1.创建sql语句
        String sql="insert into t_book values(?,?,?)";
        //2.调用方法实现
        Object[] args={book.getId(),book.getUsername(),book.getUstatus()};
        int update=jdbcTemplate.update(sql,args);
        System.out.println(update);
    }
}
