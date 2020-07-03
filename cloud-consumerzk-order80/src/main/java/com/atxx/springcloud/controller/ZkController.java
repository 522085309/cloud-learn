package com.atxx.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
public class ZkController {
    private static String  Url = "http://cloud-provider-patment8004";
    @Resource
    public RestTemplate restTemplate;

    @GetMapping(value = "/consoumer/getZk")
    public String getZk(){
        return restTemplate.getForObject(Url+"/paymentZK/get",String.class);
    }

}
