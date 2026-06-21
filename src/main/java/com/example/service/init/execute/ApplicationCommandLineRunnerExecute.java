package com.example.service.init.execute;

import com.example.service.init.execute.base.AbstractApplicationExecute;
import com.example.service.init.constant.InitializeHandlerType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ConfigurableApplicationContext;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_COMMAND_LINE_RUNNER;

/**
 * @description: 用于处理 {@link InitializingBean} 类型初始化的执行器
 */
public class ApplicationCommandLineRunnerExecute extends AbstractApplicationExecute implements CommandLineRunner {

    public ApplicationCommandLineRunnerExecute(ConfigurableApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Override
    public void run(String... args) throws Exception {
        execute();
    }

    @Override
    public String type() {
        return APPLICATION_COMMAND_LINE_RUNNER;
    }
}