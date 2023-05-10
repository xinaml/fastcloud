package com.xinaml.service.impl;

import com.xinaml.dao.PaymentDao;
import com.xinaml.service.PaymentService;
import com.xinaml.payment.entity.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }

}
