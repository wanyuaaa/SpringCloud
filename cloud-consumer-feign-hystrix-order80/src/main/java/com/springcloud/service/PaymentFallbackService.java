package com.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @author wanyu
 * @createTime 2022-04-04 17:00
 */
//统一为接口里面的方法进行异常处理
@Service
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_OK----";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService\t fallback-paymentInfo_TimeOut----";
    }
}

