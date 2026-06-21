package com.example.service.init.execute.base;

import com.example.service.init.base.InitializeHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Comparator;
import java.util.Map;

/**
 * 用于处理应用程序启动执行的基类
 */
@AllArgsConstructor
public abstract class AbstractApplicationExecute {

    protected final ConfigurableApplicationContext applicationContext;

    /**
     * 执行初始化逻辑
     * 获取所有InitializeHandler，根据类型过滤，按顺序执行
     */
    public void execute() {
        Map<String, InitializeHandler> initializeHandlerMap = applicationContext.getBeansOfType(InitializeHandler.class);
        initializeHandlerMap.values()
                .stream()
                .filter(initializeHandler -> initializeHandler.type().equals(type()))
                .sorted(Comparator.comparingInt(InitializeHandler::executeOrder))
                .forEach(initializeHandler -> {
                    initializeHandler.executeInit(applicationContext);
                });
    }

    /**
     * 初始化执行类型
     * @return 类型
     */
    public abstract String type();
}