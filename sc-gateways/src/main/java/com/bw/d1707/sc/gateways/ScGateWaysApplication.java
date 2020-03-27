package com.bw.d1707.sc.gateways;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScGateWaysApplication {
    public static void main(String[] args) {
            SpringApplication.run(ScGateWaysApplication.class,args);
        }
}
