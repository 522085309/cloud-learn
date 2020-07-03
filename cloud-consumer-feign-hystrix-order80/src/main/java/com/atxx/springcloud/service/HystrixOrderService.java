package com.atxx.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author:XJ
 *
 * fallback = HystrixOrderServiceImpl.class 实现统一的服务降级
 */
@Component
@FeignClient(value = "cloud-payment-service",fallback = HystrixOrderServiceImpl.class)
public interface HystrixOrderService {
    @GetMapping("/paymentOk/{id}")
    public String getOk(@PathVariable(value = "id") Integer id);
    @GetMapping("/paymentOut/{id}")
    public String getTimeOut(@PathVariable(value = "id") Integer id);
}
