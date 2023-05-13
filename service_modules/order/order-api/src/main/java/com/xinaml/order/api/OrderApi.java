package com.xinaml.order.api;

import com.xinaml.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liguiqin
 * @date 2023/5/13
 */
@FeignClient(name="order") //指定那个服务
public interface OrderApi {

    @GetMapping("/order/get/{id}") //给那个方法传参并获取返回值
    CommonResult getOrderById(@PathVariable("id") Integer id);
}
