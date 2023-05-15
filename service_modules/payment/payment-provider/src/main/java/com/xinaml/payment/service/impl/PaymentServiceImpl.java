package com.xinaml.payment.service.impl;

import com.xinaml.payment.dao.PaymentDao;
import com.xinaml.payment.service.PaymentService;
import com.xinaml.payment.bean.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment queryById(long id) {
        return paymentDao.queryById(id);
    }


}
