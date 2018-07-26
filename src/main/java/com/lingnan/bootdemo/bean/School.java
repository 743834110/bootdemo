package com.lingnan.bootdemo.bean;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("com.lingnan.bootdemo.bean.school")
public class School {

    private String name;

    private String place;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                '}';
    }
}
