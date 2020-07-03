package com.atxx.springcloud.service;


import com.atxx.springcloud.entities.Payment;

/**
 * @author:XJ
 */
public interface PaymentService {
    public Integer create(Payment payment);
    public Payment getPaymentId(Long id);
}
