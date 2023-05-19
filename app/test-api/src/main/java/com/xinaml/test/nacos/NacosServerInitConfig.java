package com.xinaml.test.nacos;

import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.naming.NamingFactory;
import com.alibaba.nacos.api.naming.NamingService;
import com.alibaba.nacos.api.naming.pojo.Instance;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Properties;

/**
 * @author liguiqin
 * @date 2023/5/17
 */
@Component
public class NacosServerInitConfig implements ApplicationListener<ContextRefreshedEvent> {
    //等同spring.application.name 配置文件中所写可以试着写死
    private String servicename="test-api";
    //nacos的服务地址
    private String serverAddr="127.0.0.1:8848";


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
            Properties properties = new Properties();
            properties.put(PropertyKeyConst.SERVER_ADDR, serverAddr);
            properties.put(PropertyKeyConst.NAMESPACE, "9ab5a4a0-dfcf-40c8-8b38-abfdec5f5193");
            NamingService namingService = NamingFactory.createNamingService(properties);
            // 创建一个服务实例
            Instance instance = new Instance();
            instance.setIp("127.0.0.1");
            instance.setPort(7777);
            instance.setServiceName(servicename);
            // 注册服务
            namingService.registerInstance(servicename,"DEV_GROUP", instance);
            System.out.println("Service registration successful!");

        } catch (Exception e){
            e.printStackTrace();
        }
    }


}
