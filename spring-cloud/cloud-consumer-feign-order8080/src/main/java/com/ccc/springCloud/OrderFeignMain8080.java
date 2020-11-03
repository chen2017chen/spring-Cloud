package com.ccc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/9 9:44
 */

@SpringBootApplication
@EnableFeignClients
public class OrderFeignMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain8080.class,args);
    }
}
