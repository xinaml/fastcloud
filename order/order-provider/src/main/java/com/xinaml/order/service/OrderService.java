package com.xinaml.order.service;

import com.xinaml.order.bean.Order;

/**
 * @author liguiqin
 * @date 2023/5/12
 */
public interface OrderService {
    int create(Order order);

    Order queryById(long id);
}
