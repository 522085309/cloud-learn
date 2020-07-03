package com.atxx.springcloud.controller;

import com.atxx.springcloud.entities.CommonResult;
import com.atxx.springcloud.service.PaymentFeginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
public class FeginController {
    @Resource
    private PaymentFeginService paymentFeginService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id){
       return paymentFeginService.getPaymentId(id);
    }
}
