package com.ccc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/23 21:01
 */

//@RestController=@Controller+@ResponseBody
//    @ResponseBody:将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
//                   写入到response对象的body区，通常用来返回JSON数据或者是XML
@RestController

public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello the second!";
    }
}
