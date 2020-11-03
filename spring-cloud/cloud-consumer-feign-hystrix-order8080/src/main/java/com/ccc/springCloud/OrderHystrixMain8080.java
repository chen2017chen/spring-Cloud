package com.ccc.springCloud;

import org.aspectj.weaver.ast.Or;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/9 23:09
 */
@SpringBootApplication
@EnableFeignClients
public class OrderHystrixMain8080 {
    public static void main(String[] args) {
            SpringApplication.run(OrderHystrixMain8080.class,args);
        }
}
