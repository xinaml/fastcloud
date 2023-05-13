package com.xinaml.payment.controller;

import com.xinaml.order.api.OrderApi;
import com.xinaml.payment.service.PaymentService;
import com.xinaml.payment.bean.Payment;
import com.xinaml.result.CommonResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@RefreshScope
@RestController
@Log4j2
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @Autowired
    private OrderApi orderApi;

    @Value("${config.info}")
    private  String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        log.info(configInfo);
        return configInfo;
    }

    @Value("${server.port}")
    private int port;
    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment dept) {
        int i = paymentService.create(dept);
        log.info("***************插入成功*******" + i);
        if (i > 0) {
            return CommonResult.success("插入数据库成功", dept);
        } else {
            return CommonResult.fail("插入数据库失败", null);
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult queryById(@PathVariable("id") Integer id) {
        Payment payment = paymentService.queryById(id);
        CommonResult orderResult= orderApi.getOrderById(id);
        log.info("***************查询订单成功*********" + orderResult);
        log.info("***************查询成功*********" + payment);
        if (payment != null) {
            return CommonResult.success(port+"查询成功", payment);
        } else {
            return CommonResult.fail("查询失败", null);
        }
    }

    @GetMapping("/test")
    public CommonResult test() {
        return CommonResult.success("查询成功", null);
    }
}
