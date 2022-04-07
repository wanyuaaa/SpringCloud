package com.springcloud.service;

/**
 * @author wanyu
 * @createTime 2022-04-08 5:22
 */
public interface StorageService {

    void decrease(Long productId, Integer count);

}
