package com.ccc.dao;

import com.ccc.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/11/3 14:05
 */
@Repository
public interface BookMapper {

    //增加
    int addBook(Books books);

    //删除
    int deleteBookById(@Param("bookID") int id);

    //修改
    int updateBook(Books books);

    //查询
    Books queryBookById(@Param("bookID") int id);

    //查询全部
    List<Books> queryBook();

    //通过书名查询
    Books queryBookByName(@Param("bookName") String bookName);
}
