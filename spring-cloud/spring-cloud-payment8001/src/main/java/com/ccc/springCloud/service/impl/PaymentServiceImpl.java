package com.ccc.springCloud.service.impl;

import com.ccc.springCloud.dao.PaymentDao;


import com.ccc.springCloud.entities.Payment;
import com.ccc.springCloud.service.PaymentService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ccc
 * @version 1.0
 * @date 2020/8/31 0:17
 */

//service层调用dao层

@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    //写操作
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    //读操作
    public Payment getPaymentById( Long id){
        return paymentDao.getPaymentById(id);
    }
}
