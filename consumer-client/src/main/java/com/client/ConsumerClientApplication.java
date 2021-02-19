package com.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ConsumerClientApplication {
@Bean //初始化 模板
@LoadBalanced//实现r对象ibbon负载均衡
public RestTemplate restTemplate(){
    return  new RestTemplate();
}
    public static void main(String[] args) {
        SpringApplication.run(ConsumerClientApplication.class, args);
    }

}
