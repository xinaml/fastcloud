package com.xinaml.order.service.impl;

import com.xinaml.order.bean.Order;
import com.xinaml.order.dao.OrderDao;
import com.xinaml.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liguiqin
 * @date 2023/5/12
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public int create(Order order) {
        return 0;
    }

    @Override
    public Order queryById(long id) {
        return orderDao.queryById(id);
    }
}
