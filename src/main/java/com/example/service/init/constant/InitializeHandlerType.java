package com.example.service.init.constant;

/**
 * 初始化处理器类型常量
 */
public class InitializeHandlerType {

    /**
     * InitializingBean类型初始化
     */
    public static final String APPLICATION_INITIALIZING_BEAN = "APPLICATION_INITIALIZING_BEAN";

    /**
     * PostConstruct类型初始化
     */
    public static final String APPLICATION_POST_CONSTRUCT = "APPLICATION_POST_CONSTRUCT";

    /**
     * ApplicationStartEventListener类型初始化
     */
    public static final String APPLICATION_START_EVENT_LISTENER = "APPLICATION_START_EVENT_LISTENER";

    /**
     * CommandLineRunner类型初始化
     */
    public static final String APPLICATION_COMMAND_LINE_RUNNER = "APPLICATION_COMMAND_LINE_RUNNER";
}