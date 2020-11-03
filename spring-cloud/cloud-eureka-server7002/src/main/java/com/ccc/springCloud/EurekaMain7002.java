package com.ccc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/1 23:33
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args)
    {
        SpringApplication.run(EurekaMain7002.class,args);
    }
}
