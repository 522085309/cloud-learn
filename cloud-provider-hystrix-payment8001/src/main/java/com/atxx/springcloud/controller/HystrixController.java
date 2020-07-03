package com.atxx.springcloud.controller;

import com.atxx.springcloud.service.HystrixService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
public class HystrixController {

    @Resource
    private HystrixService hystrixService;
    @GetMapping("/paymentOk/{id}")
    public String getOk(@PathVariable Integer id){
        return hystrixService.paymentInfoOk(id);
    }
    @GetMapping("/paymentOut/{id}")
    public String getTimeOut(@PathVariable Integer id){
        return hystrixService.paymentInfoTimeOut(id);
    }

}
