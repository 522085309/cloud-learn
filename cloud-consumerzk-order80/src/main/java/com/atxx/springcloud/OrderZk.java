package com.atxx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZk {
    public static void main(String[] args) {
        SpringApplication.run(OrderZk.class,args);
    }
}
