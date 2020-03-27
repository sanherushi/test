package com.bw.d1707.spring.consumer.feign;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignCallback implements HelloFeign {
    @Override
    public String hello(String name) {
        return "服务调用失败";
    }
}
