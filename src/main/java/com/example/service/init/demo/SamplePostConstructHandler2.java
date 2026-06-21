package com.example.service.init.demo;

import com.example.service.init.base.AbstractApplicationPostConstructHandler;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: 示例PostConstruct类型初始化处理器
 */
@Component
public class SamplePostConstructHandler2 extends AbstractApplicationPostConstructHandler {

    @Override
    public Integer executeOrder() {
        return 2; // 第二阶段执行
    }

    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        System.out.println("SamplePostConstructHandler2 执行，执行顺序: " + executeOrder());
        System.out.println("上下文中的Bean数量: " + context.getBeanDefinitionCount());

        // 在这里添加您的后构造初始化逻辑
        // 例如：验证依赖项、初始化缓存等
    }
}