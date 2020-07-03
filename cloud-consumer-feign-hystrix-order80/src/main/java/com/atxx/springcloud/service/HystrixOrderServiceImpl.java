package com.atxx.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author:XJ
 */
@Component
public class HystrixOrderServiceImpl implements HystrixOrderService {
    @Override
    public String getOk(Integer id) {
        return "getOk方法服务降级";
    }

    @Override
    public String getTimeOut(Integer id) {
        return "getTimeOut方法服务降级";
    }
}
