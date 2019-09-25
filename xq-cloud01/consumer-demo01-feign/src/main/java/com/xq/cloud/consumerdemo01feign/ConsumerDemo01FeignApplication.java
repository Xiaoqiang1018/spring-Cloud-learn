package com.xq.cloud.consumerdemo01feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ConsumerDemo01FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerDemo01FeignApplication.class, args);
    }

}
