package com.wang.activiti.helloworld;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 启动类
 */

public class DemoMain {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoMain.class);


    public static void main(String[] args) {

        LOGGER.info("启动我们的程序");

        //创建流程引擎
        ProcessEngineConfiguration cfg = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
        ProcessEngine processEngine = cfg.buildProcessEngine();
        String name = processEngine.getName();
        String version = ProcessEngine.VERSION;

        LOGGER.info("流程引擎名称{},版本{}",name,version);
        //部署流程定义文件

        //启动运行流程

        //处理流程任务
        LOGGER.info("结束我们的程序");
    }
}
