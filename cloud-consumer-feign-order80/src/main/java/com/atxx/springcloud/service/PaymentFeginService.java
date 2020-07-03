package com.atxx.springcloud.service;

import com.atxx.springcloud.entities.CommonResult;
import com.atxx.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:XJ
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeginService {
    @GetMapping(value = "payment/get/{id}")
    public CommonResult<Payment> getPaymentId(@PathVariable Long id);
}
