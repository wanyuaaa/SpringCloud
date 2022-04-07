package com.springcloud.service;

import java.math.BigDecimal;

/**
 * @author wanyu
 * @createTime 2022-04-08 5:33
 */
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}
