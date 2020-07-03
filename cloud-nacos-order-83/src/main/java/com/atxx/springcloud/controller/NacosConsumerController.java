package com.atxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
public class NacosConsumerController {
    @Resource
    private RestTemplate restTemplate;
    @Value("${service-url.nacos-name}")
    public String serverURL;

    @GetMapping("/consumer/nacos/get")
    public String getInfo(){
         return restTemplate.getForObject(serverURL+"/payment/nacos/get",String.class);
    }
}
