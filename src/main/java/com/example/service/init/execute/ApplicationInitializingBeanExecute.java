package com.example.service.init.execute;

import com.example.service.init.execute.base.AbstractApplicationExecute;
import com.example.service.init.constant.InitializeHandlerType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_INITIALIZING_BEAN;

/**
 * 用于处理 InitializingBean 类型初始化的执行器
 */
public class ApplicationInitializingBeanExecute extends AbstractApplicationExecute implements InitializingBean {

    public ApplicationInitializingBeanExecute(ConfigurableApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Override
    public void afterPropertiesSet() {
        execute();
    }

    @Override
    public String type() {
        return APPLICATION_INITIALIZING_BEAN;
    }
}