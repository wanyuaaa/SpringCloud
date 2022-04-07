package com.springcloud.dao;

import com.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author wanyu
 * @createTime 2022-04-08 3:06
 */
@Mapper
public interface OrderDao {

    //1 新建订单
    int create(Order order);

    //2 修改订单状态,从0改为1
    int update(@Param("userId") Long userId, @Param("status") Integer status);

}
