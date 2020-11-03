package com.ccc.springCloud.service;

import com.ccc.springCloud.entities.CommonResult;
import com.ccc.springCloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/9/9 9:46
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
//通过feign去注册中心访问对应服务的接口
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) ;
}
