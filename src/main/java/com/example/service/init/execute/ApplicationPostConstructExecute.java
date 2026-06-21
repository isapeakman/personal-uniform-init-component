package com.example.service.init.execute;

import com.example.service.init.execute.base.AbstractApplicationExecute;
import com.example.service.init.constant.InitializeHandlerType;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;

import static com.example.service.init.constant.InitializeHandlerType.APPLICATION_POST_CONSTRUCT;

/**
 * 用于处理 {@link PostConstruct} 类型初始化的执行器
 */
public class ApplicationPostConstructExecute extends AbstractApplicationExecute {

    public ApplicationPostConstructExecute(ConfigurableApplicationContext applicationContext) {
        super(applicationContext);
    }

    @PostConstruct
    public void postConstructExecute() {
        execute();
    }

    @Override
    public String type() {
        return APPLICATION_POST_CONSTRUCT;
    }
}