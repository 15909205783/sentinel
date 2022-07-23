package com.yangfan.sentinel_feign_client.client;


import org.springframework.stereotype.Component;

@Component
public class FallbackService implements FeignAgent {
    @Override
    public String hello() {
        return "系统繁忙请稍后！";
    }
}
