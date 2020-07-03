package com.atxx.springcloud.controller;

import com.atxx.springcloud.entities.CommonResult;
import com.atxx.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author:XJ
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/paymentZK/get")
    public String getPaymentId(){
        return "zk"+port;
    }

}
