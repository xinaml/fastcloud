package com.xinaml.xcx.controller;

import com.xinaml.order.api.OrderApi;
import com.xinaml.payment.api.PaymentApi;
import com.xinaml.test.api.TestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liguiqin
 * @date 2023/5/15
 */
@RestController
public class TestController {
    @Autowired
    private OrderApi orderApi;
    @Autowired
    private PaymentApi paymentApi;
    @Autowired
    private TestApi testApi;


    @GetMapping("get")
    public List<Object> queryById( Integer id) {
        List<Object> list =new ArrayList<>();
        Object orderResult = orderApi.getOrderById(1);
        Object order2Result = testApi.getTest();
        Object order3Result = paymentApi.queryById(1);
        list.add(orderResult);
        list.add(order2Result);
        list.add(order3Result);
        return list;
    }
}
