package com.ccc.springCloud.controller;




import com.ccc.springCloud.entities.CommonResult;
import com.ccc.springCloud.entities.Payment;
import com.ccc.springCloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/31 0:21
 */

//controller调用service
//service调用dao

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private  String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("**********插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,server.port"+serverPort, result);
        } else {
            return new CommonResult(404, "插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id) {
        Payment payment=paymentService.getPaymentById(id);
        log.info("**********查询结果："+payment);
        if(payment!=null){
            return new CommonResult(200,"查询成功,server.port"+serverPort,payment);
        }else {
            return new CommonResult(404,"没有对应记录，查询id:"+id,null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery(){
        List<String> services = discoveryClient.getServices();
        for (String element : services) {
            log.info("****************elenent:"+element);
        }

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());

        }
        return this.discoveryClient;

    }
}
