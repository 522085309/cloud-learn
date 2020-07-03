package com.atxx.spirngcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author:XJ
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelService {
    public static void main(String[] args) {
        SpringApplication.run(SentinelService.class,args);
    }
}
