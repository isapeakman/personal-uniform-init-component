package com.example.service.init.base;



import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_POST_CONSTRUCT;

/**
 * @description: 用于处理 {@link InitializeHandler} 类型初始化执行的抽象类
 */
public abstract class AbstractApplicationPostConstructHandler implements InitializeHandler {

    @Override
    public String type() {
        return APPLICATION_POST_CONSTRUCT;
    }
}