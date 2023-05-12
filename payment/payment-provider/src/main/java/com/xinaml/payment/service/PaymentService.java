package com.xinaml.payment.service;


import com.xinaml.payment.bean.Payment;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
public interface PaymentService {
    int create(Payment payment);

    Payment queryById(long id);
}
