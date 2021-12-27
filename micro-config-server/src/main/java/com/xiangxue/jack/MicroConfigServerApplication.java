package com.xiangxue.jack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"com.xiangxue.jack"})
//表示这个是一个配置中心
@EnableConfigServer
// 注册到eureka
@EnableEurekaClient
public class MicroConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroConfigServerApplication.class,args);
    }
}
