package com.ccc.controller;

import com.ccc.pojo.Books;
import com.ccc.service.BookService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/11/3 15:57
 */
@Controller
@RequestMapping("/book")
public class BookController {

    //controller调用service层
    @Autowired
    @Qualifier(value = "bookServiceImpl")
    private BookService bookService;


    //查询全部的书记，并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String allBook(Model model){
        List<Books> list=bookService.queryBook();
        model.addAttribute("list",list);
        return "allBook";
    }

    //跳转到增加书籍页面
    @RequestMapping("/toAddBookPage")
    public String toAddBookPage(){
        return "addBook";
    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        //重定向回allBook
        return "redirect:/book/allBook";
    }
    //跳转到修改页面
    @RequestMapping("/toUpdateBook")
    public String toUpdatePage(int id, Model model){
        Books books=bookService.queryBookById(id);
        model.addAttribute("QueryBook",books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String queryBookByName,Model model1){
        Books books=bookService.queryBookByName(queryBookByName);
       List<Books> list=new ArrayList<Books>();
        list.add(books);
        if(books==null){
            list=bookService.queryBook();
            model1.addAttribute("error","该书籍不存在！");
        }
        model1.addAttribute("list", list);
        return "allBook";
    }
}
