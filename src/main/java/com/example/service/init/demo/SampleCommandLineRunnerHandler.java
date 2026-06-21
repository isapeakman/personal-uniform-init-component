package com.example.service.init.demo;

import com.example.service.init.base.AbstractApplicationCommandLineRunnerHandler;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: 示例CommandLineRunner类型初始化处理器
 */
@Component
public class SampleCommandLineRunnerHandler extends AbstractApplicationCommandLineRunnerHandler {

    @Override
    public Integer executeOrder() {
        return 1; // 第四阶段执行
    }

    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        System.out.println("SampleCommandLineRunnerHandler 执行，执行顺序: " + executeOrder());
        System.out.println("准备处理命令行参数: " + context.getEnvironment().getProperty("spring.args"));

        // 在这里添加您的命令行运行器逻辑
        // 例如：处理命令行参数、启动后台任务等
    }
}