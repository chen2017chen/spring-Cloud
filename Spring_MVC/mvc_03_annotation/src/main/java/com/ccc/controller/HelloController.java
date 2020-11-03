package com.ccc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/25 14:00
 */
@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String h1(Model model){
        model.addAttribute("msg","Hello,SpringMVC for Annotation");
        return "hello";

    }
}
