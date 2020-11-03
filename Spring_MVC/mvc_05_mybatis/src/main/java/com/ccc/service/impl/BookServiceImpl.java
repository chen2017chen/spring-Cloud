package com.ccc.service.impl;

import com.ccc.dao.BookMapper;
import com.ccc.pojo.Books;
import com.ccc.service.BookService;


import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/27 22:07
 *
 * 业务层service调用dao层 组合Dao
 *
 */
public class BookServiceImpl implements BookService {



    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper)
    {
        this.bookMapper = bookMapper;
    }
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public void setBookMapper(String bookMapper) {
    }
}
