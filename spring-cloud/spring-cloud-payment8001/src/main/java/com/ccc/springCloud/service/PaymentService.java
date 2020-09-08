package com.ccc.springCloud.service;



import com.ccc.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/31 0:16
 */
public interface PaymentService
{

    //写操作
    public int create(Payment payment);

    //读操作
    public Payment getPaymentById(@Param("id") Long id);
}
