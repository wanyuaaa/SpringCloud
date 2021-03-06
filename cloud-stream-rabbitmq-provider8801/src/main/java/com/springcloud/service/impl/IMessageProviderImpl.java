package com.springcloud.service.impl;

import com.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author wanyu
 * @createTime 2022-04-05 15:51
 */
@EnableBinding(Source.class)    //定义消息的推送管道（Source是spring的）
public class IMessageProviderImpl implements IMessageProvider {

    @Resource
    private MessageChannel output;  //消息发送管道

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        //MessageBuilder是spring的integration.support.MessageBuilder
        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*******serial: " + serial);
        return null;
    }
}
