package com.xinaml.xcx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
@EnableFeignClients({"com.xinaml.order.api","com.xinaml.payment.api","com.xinaml.test.api"})
@ComponentScan(basePackages = {"com.xinaml.xcx", "com.xinaml.provider"})
public class XcxWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcxWebApplication.class, args);
    }
}
