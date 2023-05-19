package com.xinaml.test.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author liguiqin
 * @date 2023/5/13
 */
@FeignClient(name="test-api") //指定那个服务
public interface TestApi {

    @GetMapping("getTest") //给那个方法传参并获取返回值
    Object getTest();
}
