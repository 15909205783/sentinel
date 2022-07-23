package com.yangfan.sentinelcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @SentinelResource(value = "Sentinel_SpringCloud",blockHandler = "exceptionHandler")
    @GetMapping("ann")
    public String hello(){
        return "hello sentinel!";
    }


    public String exceptionHandler(BlockException ex){
        ex.printStackTrace();
        return "系统繁忙，请稍后";
    }
}
