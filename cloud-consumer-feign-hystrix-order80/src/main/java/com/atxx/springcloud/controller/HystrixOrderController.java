package com.atxx.springcloud.controller;

import com.atxx.springcloud.service.HystrixOrderService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@RestController
public class HystrixOrderController {
    @Resource
    private HystrixOrderService hystrixOrderService;
    @GetMapping("/con/paymentOk/{id}")
    public String getOk(@PathVariable(value = "id") Integer id){
        return hystrixOrderService.getOk(id);
    }

    /**
     * 这种一个方法，一个降级的形式，在业务量大的时候，代码膨胀严重，因此采用实现调用接口，并在接口上添加注解的方式进行服务降级
     */
    @GetMapping("/con/paymentOut/{id}")
    @HystrixCommand(fallbackMethod = "orderInfoTimeOutHandler",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "500")})
    public String getTimeOut(@PathVariable(value = "id") Integer id){
        int i = 1 / 0;
        return hystrixOrderService.getTimeOut(id);
    }
    public String orderInfoTimeOutHandler(@PathVariable(value = "id") Integer id){
        return "服务被降级";
    }
}
