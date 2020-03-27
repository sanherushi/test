package com.bw.d1707.spring.consumer.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RibbonConfig {
    /**
     * 添加@LoadBalanced注解，restTemplate实现负载均衡
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 配置负载均衡算法
     * @return
     */
    @Bean
    public IRule iRule(){
        /** 轮询方式选取一个服务，进行访问 **/
        return new RoundRobinRule();
        /** 随机选取一个服务，进行访问 **/
        //return new RandomRule();
        /** 重试方式,先以轮询的方式访问,如果一个服务挂了，会尝试几次访问，如果几次访问失败后，下次就跳过失败的服务 **/
        //return new RetryRule();
        /** 当高并发时，会选中最空闲当服务 **/
        //return new BestAvailableRule();
        /** 按照权重访问 **/
        //return new WeightedResponseTimeRule();
        /** 先过滤清单再轮训 PredicateBasedRule **/
        //return new AvailabilityFilteringRule();
        /** 先过滤清单再轮训 PredicateBasedRule **/
        //return new ZoneAvoidanceRule();
    }
}
