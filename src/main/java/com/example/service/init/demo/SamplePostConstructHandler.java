package com.example.service.init.demo;

import com.example.service.init.base.AbstractApplicationPostConstructHandler;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: 示例PostConstruct类型初始化处理器
 */
@Component
public class SamplePostConstructHandler extends AbstractApplicationPostConstructHandler {

    @Override
    public Integer executeOrder() {
        return 1; // 第二阶段执行
    }

    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        System.out.println("SamplePostConstructHandler 执行，执行顺序: " + executeOrder());
        System.out.println("上下文中的Bean数量: " + context.getBeanDefinitionCount());

        // 在这里添加您的后构造初始化逻辑
        // 例如：验证依赖项、初始化缓存等
    }
}