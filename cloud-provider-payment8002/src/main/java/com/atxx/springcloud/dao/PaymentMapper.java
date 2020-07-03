package com.atxx.springcloud.dao;

import com.atxx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentMapper {
    public Integer create(Payment payment);
    public Payment getPaymentId(Long id);
}
