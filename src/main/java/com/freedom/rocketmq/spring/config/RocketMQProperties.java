package com.freedom.rocketmq.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@ConfigurationProperties( prefix = "spring.rocketmq")
public class RocketMQProperties {

    /**
     * name server for rocketmq
     * formats: `host:port;host:port`
     */
    @Value("${spring.rocketmq.nameServer:}")
    private String nameServer;



    /**
     * Producer参数
     */
    /** 生产组 */
    @Value("${spring.rocketmq.producer.group:}")
    private String producerGroup;

    /** 是否vip通道，默认值：false */
    @Value("${spring.rocketmq.producer.vipChannelEnabled:false}")
    private boolean vipChannelEnabled;

    /**
     * 发送消息超时时间，单位毫秒，默认值3000
     */
    @Value("${spring.rocketmq.producer.sendMsgTimeout:3000}")
    private int sendMsgTimeout;

    /**
     * 压缩消息体的阀值，默认：1024 * 4，4k，4096，即默认大于4k的消息体将开启压缩
     */
    @Value("${spring.rocketmq.producer.compressMsgBodyOverHowmuch:4096}")
    private int compressMsgBodyOverHowmuch;

    /**
     * 在同步模式下，声明发送失败之前内部执行的最大重试次数，默认值：2
     * 这可能会导致消息重复，应用程序开发人员需要解决此问题
     */
    @Value("${spring.rocketmq.producer.retryTimesWhenSendFailed:2}")
    private int retryTimesWhenSendFailed;

    /**
     * 在异步模式下，声明发送失败之前内部执行的最大重试次数，默认值：2
     * 这可能会导致消息重复，应用程序开发人员需要解决此问题
     */
    @Value("${spring.rocketmq.producer.retryTimesWhenSendAsyncFailed:2}")
    private int retryTimesWhenSendAsyncFailed;

    /**
     * 内部发送失败时是否重试另一个broker，默认值：false
     */
    @Value("${spring.rocketmq.producer.retryAnotherBrokerWhenNotStoreOk:false}")
    private boolean retryAnotherBrokerWhenNotStoreOk;

    /**
     * 消息体最大值，单位byte，默认：1024*1024*4=4Mb，4194304
     */
    @Value("${spring.rocketmq.producer.maxMessageSize:4194304}")
    private int maxMessageSize;


    public String getProducerGroup() {
        return producerGroup;
    }
    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }
    public boolean isVipChannelEnabled() {
        return vipChannelEnabled;
    }
    public void setVipChannelEnabled(boolean vipChannelEnabled) {
        this.vipChannelEnabled = vipChannelEnabled;
    }
    public int getSendMsgTimeout() {
        return sendMsgTimeout;
    }
    public void setSendMsgTimeout(int sendMsgTimeout) {
        this.sendMsgTimeout = sendMsgTimeout;
    }
    public int getCompressMsgBodyOverHowmuch() {
        return compressMsgBodyOverHowmuch;
    }
    public void setCompressMsgBodyOverHowmuch(int compressMsgBodyOverHowmuch) {
        this.compressMsgBodyOverHowmuch = compressMsgBodyOverHowmuch;
    }
    public int getRetryTimesWhenSendFailed() {
        return retryTimesWhenSendFailed;
    }
    public void setRetryTimesWhenSendFailed(int retryTimesWhenSendFailed) {
        this.retryTimesWhenSendFailed = retryTimesWhenSendFailed;
    }
    public int getRetryTimesWhenSendAsyncFailed() {
        return retryTimesWhenSendAsyncFailed;
    }
    public void setRetryTimesWhenSendAsyncFailed(int retryTimesWhenSendAsyncFailed) {
        this.retryTimesWhenSendAsyncFailed = retryTimesWhenSendAsyncFailed;
    }
    public boolean isRetryAnotherBrokerWhenNotStoreOk() {
        return retryAnotherBrokerWhenNotStoreOk;
    }
    public void setRetryAnotherBrokerWhenNotStoreOk(boolean retryAnotherBrokerWhenNotStoreOk) {
        this.retryAnotherBrokerWhenNotStoreOk = retryAnotherBrokerWhenNotStoreOk;
    }
    public int getMaxMessageSize() {
        return maxMessageSize;
    }
    public void setMaxMessageSize(int maxMessageSize) {
        this.maxMessageSize = maxMessageSize;
    }


    public String getNameServer() {
        return nameServer;
    }
    public void setNameServer(String nameServer) {
        this.nameServer = nameServer;
    }
}
