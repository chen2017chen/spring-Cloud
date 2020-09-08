package com.ccc.springCloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/3 8:42
 */

@RestController
@Slf4j
public class PaymentController
{
    @Value("${server.port}")
    private String serverPort;

    public String paymentZookeeper(){
        return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
