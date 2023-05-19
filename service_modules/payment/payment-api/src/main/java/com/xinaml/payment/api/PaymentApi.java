package com.xinaml.payment.api;

import com.xinaml.provider.result.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liguiqin
 * @date 2023/5/13
 */
@FeignClient(name="payment") //指定那个服务
public interface PaymentApi {

    @GetMapping("/payment/get/{id}") //给那个方法传参并获取返回值
    CommonResult queryById(@PathVariable("id") Integer id);
}
