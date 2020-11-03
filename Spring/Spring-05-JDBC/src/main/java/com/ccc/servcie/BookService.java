package com.ccc.servcie;

import com.ccc.dao.BookDao;
import com.ccc.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/10/26 16:44
 */

@Service
public class BookService {

    @Autowired
    //注入dao
    private BookDao bookDao;

    public void addBook(Book book){
       bookDao.add(book);
    }
}
