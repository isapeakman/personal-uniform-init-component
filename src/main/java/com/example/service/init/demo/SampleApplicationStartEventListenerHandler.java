package com.example.service.init.demo;

import com.example.service.init.base.AbstractApplicationStartEventListenerHandler;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: 示例ApplicationStartEventListener类型初始化处理器
 */
@Component
public class SampleApplicationStartEventListenerHandler extends AbstractApplicationStartEventListenerHandler {

    @Override
    public Integer executeOrder() {
        return 1;
    }

    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        System.out.println("SampleApplicationStartEventListenerHandler 执行，执行顺序: " + executeOrder());
        System.out.println("应用程序已完全启动！");

        // 在这里添加您的应用启动逻辑
        // 例如：注册端点、启动定时任务等
    }
}