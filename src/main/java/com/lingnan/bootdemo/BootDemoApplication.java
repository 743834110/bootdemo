package com.lingnan.bootdemo;

import com.lingnan.bootdemo.bean.School;
import com.lingnan.bootdemo.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import java.util.Random;

@Configuration
@ComponentScan(basePackages = {"com.lingnan.bootdemo.controller"})
@EnableAutoConfiguration
@EnableConfigurationProperties({Student.class, School.class})
@PropertySource("classpath:/myProperties.properties")
public class BootDemoApplication {

    @Autowired
    private Environment environment;


    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(BootDemoApplication.class);
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);
    }
}
