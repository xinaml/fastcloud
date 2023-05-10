package com.xinaml.controller;

import com.xinaml.payment.entity.Payment;
import com.xinaml.result.CommonResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@Log4j2
public class OrderController {
    //调用支付订单服务端的ip+端口号
    public static final  String PAYMENT_URL = "http://payment";

    @Autowired
    private RestTemplate restTemplate;
    //创建支付订单的接口
    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }
    //获取id获取支付订单
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }
}
