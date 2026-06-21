package com.example.service.init.config;

import com.example.service.init.execute.ApplicationCommandLineRunnerExecute;
import com.example.service.init.execute.ApplicationInitializingBeanExecute;
import com.example.service.init.execute.ApplicationPostConstructExecute;
import com.example.service.init.execute.ApplicationStartEventListenerExecute;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 初始化执行相关配置
 */
public class ServiceInitAutoConfig {

    @Bean
    public ApplicationInitializingBeanExecute applicationInitializingBeanExecute(
            ConfigurableApplicationContext applicationContext) {
        return new ApplicationInitializingBeanExecute(applicationContext);
    }

    @Bean
    public ApplicationPostConstructExecute applicationPostConstructExecute(
            ConfigurableApplicationContext applicationContext) {
        return new ApplicationPostConstructExecute(applicationContext);
    }

    @Bean
    public ApplicationStartEventListenerExecute applicationStartEventListenerExecute(
            ConfigurableApplicationContext applicationContext) {
        return new ApplicationStartEventListenerExecute(applicationContext);
    }

    @Bean
    public ApplicationCommandLineRunnerExecute applicationCommandLineRunnerExecute(
            ConfigurableApplicationContext applicationContext) {
        return new ApplicationCommandLineRunnerExecute(applicationContext);
    }
}