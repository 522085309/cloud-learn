package com.atxx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:XJ
 */
@RestController
public class NacosController {
    @Value(value = "${server.port}")
    public String port;

    @GetMapping("/payment/nacos/get")
    public String getInfo(){
        return port;
    }
}
