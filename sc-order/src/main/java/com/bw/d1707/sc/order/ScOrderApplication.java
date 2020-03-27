package com.bw.d1707.sc.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ScOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScOrderApplication.class,args);
    }
}
