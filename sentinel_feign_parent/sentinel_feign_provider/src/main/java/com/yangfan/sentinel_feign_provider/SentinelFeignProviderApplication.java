package com.yangfan.sentinel_feign_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //开启Eureka客户端发现功能
@SpringBootApplication
public class SentinelFeignProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SentinelFeignProviderApplication.class, args);
    }

}
