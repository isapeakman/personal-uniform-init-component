package com.example.service.init.base;

import org.springframework.beans.factory.InitializingBean;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_START_EVENT_LISTENER;


/**
 * 用于处理 ApplicationListener 类型初始化执行的抽象类
 */
public abstract class AbstractApplicationStartEventListenerHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_START_EVENT_LISTENER;
    }
}
