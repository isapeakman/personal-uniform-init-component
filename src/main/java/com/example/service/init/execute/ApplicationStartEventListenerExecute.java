package com.example.service.init.execute;

import com.example.service.init.execute.base.AbstractApplicationExecute;
import com.example.service.init.constant.InitializeHandlerType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_START_EVENT_LISTENER;

/**
 * 用于处理 ApplicationStartedEvent 类型初始化的执行器
 */
public class ApplicationStartEventListenerExecute extends AbstractApplicationExecute implements ApplicationListener<ApplicationStartedEvent> {

    public ApplicationStartEventListenerExecute(ConfigurableApplicationContext applicationContext) {
        super(applicationContext);
    }

    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        execute();
    }

    @Override
    public String type() {
        return APPLICATION_START_EVENT_LISTENER;
    }
}