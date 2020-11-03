package com.ccc.springCloud;

import com.ccc.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/31 11:36
 */

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
public class OrderMain8080 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8080.class,args);
    }
}
