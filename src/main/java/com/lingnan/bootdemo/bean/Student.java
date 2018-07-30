package com.lingnan.bootdemo.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.DependsOn;


/**
 * 从配置文件中来的属性值以setter方法注入进来
 */
@ConfigurationProperties(prefix = "com.lingnan.bootdemo.bean.student")
public class Student {

    private String name;

    private Integer age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
