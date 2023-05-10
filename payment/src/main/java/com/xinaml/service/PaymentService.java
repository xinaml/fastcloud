package com.xinaml.service;


import com.xinaml.payment.entity.Payment;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
public interface PaymentService {
    int create(Payment payment);

    Payment queryById(long id);
}
