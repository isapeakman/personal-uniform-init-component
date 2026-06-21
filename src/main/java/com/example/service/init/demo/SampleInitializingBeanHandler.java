package com.example.service.init.demo;

import com.example.service.init.base.AbstractApplicationInitializingBeanHandler;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @description: 示例InitializingBean类型初始化处理器
 */
@Component
public class SampleInitializingBeanHandler extends AbstractApplicationInitializingBeanHandler {
    /**
     * 获取执行顺序
     * @return 返回执行顺序的整数值，数值越小执行顺序越靠前
     */

    @Override
    public Integer executeOrder() {
        return 1; // 第一阶段执行
    /**
     * 执行初始化逻辑
     * @param context 应用上下文，提供对应用程序环境的访问
     */
    }

    @Override
    public void executeInit(ConfigurableApplicationContext context) {
        System.out.println("SampleInitializingBeanHandler 执行，执行顺序: " + executeOrder());
        System.out.println("应用上下文: " + context.getDisplayName());

        // 在这里添加您的初始化逻辑
        // 例如：初始化数据库、加载配置等
    }
}