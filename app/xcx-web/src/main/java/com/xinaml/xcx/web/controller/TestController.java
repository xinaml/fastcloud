package com.xinaml.xcx.web.controller;

import com.xinaml.order.api.OrderApi;
import com.xinaml.payment.api.PaymentApi;
import com.xinaml.result.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("get/{id}")
    public List<CommonResult> queryById(@PathVariable("id") Integer id) {
        List<CommonResult> list =new ArrayList<>();
        CommonResult orderResult = orderApi.getOrderById(id);
        CommonResult paymentResult = paymentApi.queryById(id);
        list.add(orderResult);
        list.add(paymentResult);
        return list;
    }
}
