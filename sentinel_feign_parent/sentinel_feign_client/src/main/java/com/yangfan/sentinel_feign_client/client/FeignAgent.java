package com.yangfan.sentinel_feign_client.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sentinel-feign-provider",fallback = FallbackService.class)
public interface FeignAgent {

    @GetMapping("/hello")
    String hello();
}
