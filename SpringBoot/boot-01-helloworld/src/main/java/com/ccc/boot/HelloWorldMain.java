package com.ccc.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/21 23:01
 */

/*
 * @SpringBootApplication来标注这是一个主启动类，说明这是一个springboot应用
 * */
@SpringBootApplication
public class HelloWorldMain {

    public static void main(String[] args) {

        SpringApplication.run(HelloWorldMain.class, args);
    }
}
