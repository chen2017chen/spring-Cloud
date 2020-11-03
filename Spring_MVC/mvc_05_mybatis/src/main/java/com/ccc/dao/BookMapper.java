package com.ccc.dao;

import com.ccc.pojo.Books;
import org.springframework.context.annotation.Bean;

import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/26 23:19
 */

public interface BookMapper {
    //增加
    public int addBook(Books books);

    //删除
    public int deleteBookById(int id);

    //修改
    public int updateBook(Books books);

    //查询
    public Books queryBookById(int id);

    //查询全部的书
    public List<Books> queryAllBook();

}
