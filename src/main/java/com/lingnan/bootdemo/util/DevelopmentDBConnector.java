package com.lingnan.bootdemo.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * 开发环境数据库配置
 */
@Component("connector")
@Profile("dev")
public class DevelopmentDBConnector implements DBConnector{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void configure() {

        this.logger.info("开发环境数据库配置");

    }
}
