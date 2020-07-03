package com.atxx.springcloud.service.impl;

import com.atxx.springcloud.dao.PaymentMapper;
import com.atxx.springcloud.entities.Payment;
import com.atxx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author:XJ
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentMapper paymentMapper;
    @Override
    public Integer create(Payment payment) {
        return paymentMapper.create(payment);
    }

    @Override
    public Payment getPaymentId(Long id) {
        return paymentMapper.getPaymentId(id);
    }
}
