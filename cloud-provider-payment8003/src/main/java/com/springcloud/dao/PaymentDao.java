package com.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wanyu
 * @createTime 2022-04-02 12:02
 */
@Mapper
public interface PaymentDao extends BaseMapper<Payment> {

}
