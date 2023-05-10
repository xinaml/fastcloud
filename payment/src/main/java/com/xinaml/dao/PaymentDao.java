package com.xinaml.dao;

import com.xinaml.payment.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@Mapper
@Repository
public interface PaymentDao {
    int create(Payment payment);

    Payment queryById(@Param("id") long id);
}
