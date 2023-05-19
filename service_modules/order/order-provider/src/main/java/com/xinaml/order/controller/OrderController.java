package com.xinaml.order.controller;

import com.xinaml.order.bean.Order;
import com.xinaml.order.service.OrderService;
import com.xinaml.provider.result.CommonResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * @author liguiqin
 * @date 2022/9/28
 */
@RefreshScope
@RestController
@Log4j2
public class OrderController {
    @Autowired
    private OrderService orderService;
    @Value("${server.port}")
    private int port;
    @Value("${config.info}")
    private  String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo() {
        log.info(configInfo);
        return configInfo;
    }


    @GetMapping("/order/get/{id}")
    public CommonResult queryById(@PathVariable("id") Long id) {
        Order order= orderService.queryById(id);
        log.info("***************查询成功*********" + order);
        if (order != null) {
            return CommonResult.success(port+"查询成功", order);
        } else {
            return CommonResult.fail("查询失败", null);
        }
    }

}
