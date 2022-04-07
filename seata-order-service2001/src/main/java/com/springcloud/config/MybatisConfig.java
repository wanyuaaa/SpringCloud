package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author wanyu
 * @createTime 2022-04-08 3:11
 */
@MapperScan("com.springcloud.dao")
@Configuration
public class MybatisConfig {
}

