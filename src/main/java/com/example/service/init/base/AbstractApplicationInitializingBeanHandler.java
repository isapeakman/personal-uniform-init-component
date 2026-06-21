package com.example.service.init.base;

import org.springframework.beans.factory.InitializingBean;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_INITIALIZING_BEAN;

/**
 * @description: 用于处理 {@link InitializingBean} 类型初始化执行的抽象类
 */
public abstract class AbstractApplicationInitializingBeanHandler implements InitializeHandler {

    @Override
    public String type() {
        return APPLICATION_INITIALIZING_BEAN;
    }
}