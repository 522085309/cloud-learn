package com.atxx.spirngcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atxx.springcloud.entities.CommonResult;
import com.atxx.springcloud.entities.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:XJ
 */
@RestController
public class RateLimitController {
    @GetMapping(value = "/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handlerException")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流",new Payment(2020L,"serial001"));
    }
    public CommonResult handlerException(BlockException blcokException){
        return new CommonResult(200,blcokException.getClass().getCanonicalName()+"服务部可用");
    }
}
