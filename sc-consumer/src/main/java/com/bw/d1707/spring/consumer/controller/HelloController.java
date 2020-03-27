package com.bw.d1707.spring.consumer.controller;

import com.bw.d1707.spring.consumer.feign.HelloFeign;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class HelloController {
    @Resource
    private RestTemplate restTemplate;
    @Autowired
    private HelloFeign helloFeign;
    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "HystrixFallbackMethod")
    public String hello(@RequestParam("name")String name){
        //service-producer服务名称，是application.properties文件定义的spring.application.name的名字
        //getForObject方法返回的是json类型的字符串
        //return restTemplate.getForObject("http://sc-producer/producer/hello?name="+name,String.class);
        return helloFeign.hello(name);
    }

    public String HystrixFallbackMethod(String name){
        return "服务调用失败";
    }
}
