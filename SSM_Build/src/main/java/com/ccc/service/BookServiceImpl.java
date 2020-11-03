package com.ccc.service;

import com.ccc.dao.BookMapper;
import com.ccc.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/11/3 14:26
 */
@Service
public class BookServiceImpl implements BookService {

    //service调用dao层
    @Autowired
     private BookMapper bookMapper;
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

    public List<Books> queryBook() {
        return bookMapper.queryBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
