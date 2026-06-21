package com.example.service.init.base;

import org.springframework.boot.CommandLineRunner;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_COMMAND_LINE_RUNNER;

/**
 * @description: 用于处理 {@link CommandLineRunner} 类型 初始化执行 抽象
 **/
public abstract class AbstractApplicationCommandLineRunnerHandler implements InitializeHandler {
    
    @Override
    public String type() {
        return APPLICATION_COMMAND_LINE_RUNNER;
    }
}
