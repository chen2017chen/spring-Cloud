package com.ccc.controller;

import com.ccc.pojo.Books;
import com.ccc.service.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/28 0:12
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    //查询全部的书籍，并且返回一个数据展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "AddBook";
    }

    //书籍增加
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";//重定向回到allBook
    }

    //跳转到修改书籍页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id, Model model){
        Books books=bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return "UpdateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("update=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";//重定向回到allBook
    }


}
