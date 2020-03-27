package com.bawei.d1707.spring.producer.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@RequestMapping("/producer")
public class HelloController {
    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name){
        return serverPort+":"+name;
    }
}
