package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/10/13 12:35
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back-paymentInfo_Timeout";
    }
}
