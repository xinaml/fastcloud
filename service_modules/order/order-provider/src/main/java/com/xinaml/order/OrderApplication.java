package com.xinaml.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient //开启服务发现
@SpringBootApplication //springboot启动类
@RefreshScope //开启配置更新功能
@ComponentScan(basePackages = {"com.xinaml.order","com.xinaml.provider"}) //com.xinaml.provider扫描provider的配置类,com.xinaml.order扫描order自身模块的配置类
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
