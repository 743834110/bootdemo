package com.lingnan.bootdemo;

import com.alibaba.druid.pool.DruidDataSource;
import com.lingnan.bootdemo.bean.Course;
import com.lingnan.bootdemo.bean.School;
import com.lingnan.bootdemo.bean.Score;
import com.lingnan.bootdemo.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.util.Random;


/**# @EnableAutoConfiguration
 * 借助@import的支持，
 * 收集和注册特定场景的bean定义
 */
@Configuration
@ComponentScan(basePackages = {"com.lingnan.bootdemo"})
@EnableAutoConfiguration
@EnableConfigurationProperties({Student.class, School.class})
@PropertySource("classpath:myProperties.properties")
public class BootDemoApplication {


    private ApplicationContext context;

    @Autowired
    public BootDemoApplication(ApplicationContext context){
        this.context = context;
    }


    @Bean
    public Course course(){
      return new Course("中国近代历史");
    };



    @Bean
    public Score score(){
        return new Score(this.context.getBean(Student.class), this.course(), 56);
    };



    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(BootDemoApplication.class);
        springApplication.setAddCommandLineProperties(false);
        springApplication.run(args);

    }
}
