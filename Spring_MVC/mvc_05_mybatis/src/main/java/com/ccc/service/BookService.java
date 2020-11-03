package com.ccc.service;

import com.ccc.pojo.Books;

import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/27 22:03
 */
public interface BookService {
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
