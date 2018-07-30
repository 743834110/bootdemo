package com.lingnan.bootdemo.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String, Date> {

    private SimpleDateFormat[] formats = new SimpleDateFormat[]{
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"),
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")
    };

    @Override
    public Date convert(String source) {

        for (SimpleDateFormat format: formats){
            try {
                return format.parse(source);
            } catch (ParseException e) {

            }
        }
        return null;
    }
}
