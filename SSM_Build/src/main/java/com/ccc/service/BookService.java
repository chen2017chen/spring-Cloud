package com.ccc.service;

import com.ccc.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.awt.print.Book;
import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/11/3 14:25
 */
public interface BookService {
    //增加
    int addBook(Books books);

    //删除
    int deleteBookById( int id);

    //修改
    int updateBook(Books books);

    //查询
    Books queryBookById(int id);

    //查询全部
    List<Books> queryBook();

    //通过书名查询
    Books queryBookByName(String bookName);
}
