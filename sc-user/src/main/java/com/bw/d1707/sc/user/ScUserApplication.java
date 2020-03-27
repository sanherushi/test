package com.bw.d1707.sc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ScUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScUserApplication.class,args);
    }
}
