package com.xinaml.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ComponentScan;


@EnableDiscoveryClient
@SpringBootApplication
@RefreshScope
@ComponentScan(basePackages = {"com.xinaml"})
public class PayMentApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayMentApplication.class, args);
    }
}
