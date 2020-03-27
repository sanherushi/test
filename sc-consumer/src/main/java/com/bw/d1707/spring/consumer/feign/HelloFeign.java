package com.bw.d1707.spring.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "sc-producer"/*,fallback = HelloFeignCallback.class*/)
public interface HelloFeign {
    @RequestMapping("/producer/hello")
    public String hello(@RequestParam("name")String name);
}
