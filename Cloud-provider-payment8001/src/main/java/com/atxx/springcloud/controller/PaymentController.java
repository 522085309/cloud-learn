package com.atxx.springcloud.controller;

import com.atxx.springcloud.entities.CommonResult;
import com.atxx.springcloud.entities.Payment;
import com.atxx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @Value("${server.port}")
    private String port;
    @PostMapping(value = "payment/create")
    public CommonResult<Payment> create(@RequestBody  Payment payment){
        if (paymentService.create(payment) >0 ) {
            return new CommonResult<>(200,"插入数据成功,port = "+port);
        }else {
            return new CommonResult<>(500,"插入数据库失败,port = "+port);
        }
    }
    @GetMapping(value = "payment/get/{id}")
    public CommonResult<Payment> getPaymentId(@PathVariable  Long id){
        return new CommonResult<>(200,"查询成功,port = "+port,paymentService.getPaymentId(id));
    }
}
