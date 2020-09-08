package com.ccc.springCloud.controller;

import com.ccc.springCloud.entities.CommonResult;
import com.ccc.springCloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/3 10:17
 */

@RestController
@Slf4j
public class OrderConsulController {

    public static final String INVOKE_URL="http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/consumer/payment/consul")
    public String paymentInfo(){
        String result=restTemplate.getForObject(INVOKE_URL+"/payment/consul",String.class);
        return result;
    }
}
