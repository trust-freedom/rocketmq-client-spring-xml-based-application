package com.freedom.rocketmq.spring.core.consumer;

/**
 * RocketMQ Consumer Lifecycle Listener
 */
public interface RocketMQConsumerLifecycleListener<T> {
    void prepareStart(final T consumer);
}
