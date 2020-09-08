package com.ccc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/31 11:36
 */

@SpringBootApplication
@EnableEurekaClient
public class OrderMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8080.class,args);
    }
}
