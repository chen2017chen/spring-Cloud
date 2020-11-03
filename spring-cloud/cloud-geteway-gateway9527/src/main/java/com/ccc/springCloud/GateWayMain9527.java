package com.ccc.springCloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/11 16:19
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GateWayMain9527 {

    public static void main(String[] args) {
            SpringApplication.run(GateWayMain9527.class,args);
        }
}
