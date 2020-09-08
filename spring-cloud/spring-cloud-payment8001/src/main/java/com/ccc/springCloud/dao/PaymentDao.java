package com.ccc.springCloud.dao;



import com.ccc.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/30 23:59
 */

@Mapper
public interface PaymentDao
{
    //写操作
    public int create(Payment payment);

    //读操作
    public Payment getPaymentById(@Param("id") Long id);
}
