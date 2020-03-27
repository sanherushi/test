package com.bawei.d1707.spring.producer;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient
public class ScProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScProducerApplication.class,args);
    }

    @Bean
    public ServletRegistrationBean hystrixMetricsStreamServlet() {
            ServletRegistrationBean registration = new ServletRegistrationBean(new
                    HystrixMetricsStreamServlet());
            registration.addUrlMappings("/actuator/hystrix.stream");
            return registration;
        }
}
