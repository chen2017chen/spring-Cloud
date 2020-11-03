package com.ccc.controller;

import com.ccc.pojo.User;
import com.ccc.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/26 16:04
 */

@RestController
public class UserController {

    @RequestMapping(value = "/json1")
    public  String json1() throws JsonProcessingException {

        //jackson.ObjectMapper
        //ObjectMapper mapper=new ObjectMapper();

        //创建一个对象
        User user=new User("ccc",18,"男");
        //String str=mapper.writeValueAsString(user);
        return JsonUtils.getJson(user);
    }

    @RequestMapping(value = "/json2")
    public  String json2() {

        //jackson.ObjectMapper
        ObjectMapper mapper=new ObjectMapper();
        Date date=new Date();
        return JsonUtils.getJson(date);
    }
}
