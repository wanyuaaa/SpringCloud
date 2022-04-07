package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanyu
 * @createTime 2022-04-08 5:24
 */
@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {
}

