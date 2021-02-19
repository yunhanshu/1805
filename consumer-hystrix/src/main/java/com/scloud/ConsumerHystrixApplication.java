package com.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;

@SpringCloudApplication
@EnableFeignClients
@EnableCircuitBreaker //标识hystrix启动
public class ConsumerHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixApplication.class, args);
    }

}
