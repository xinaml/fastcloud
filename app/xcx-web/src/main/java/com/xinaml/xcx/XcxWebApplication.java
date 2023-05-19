package com.xinaml.xcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient//开启服务发现
@SpringBootApplication//springboot启动类
@RefreshScope//开启配置更新功能
@EnableFeignClients({"com.xinaml.order.api","com.xinaml.payment.api","com.xinaml.test.api"})//开启feign
@ComponentScan(basePackages = {"com.xinaml.xcx", "com.xinaml.provider"})//com.xinaml.provider扫描provider的配置类,com.xinaml.xcx扫描xcx自身模块的配置类
public class XcxWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcxWebApplication.class, args);
    }
}
