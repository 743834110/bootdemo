package com.lingnan.bootdemo.controller;

import com.lingnan.bootdemo.bean.School;
import com.lingnan.bootdemo.bean.Student;
import com.sun.deploy.net.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RequestMapping("/")
@Controller
public class StudentController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private Student student;

    @Autowired
    private School school;

    @Value("${com.lingan.number}")
    private Object random;

    @RequestMapping("/helloWorld")
    @ResponseBody
    public Map<String, Object> helloWorldAction(){

        Map<String, Object> result = new HashMap<>();
        result.put("message", "Hello My Spring World!");
        return result;
    }



    @RequestMapping("/student/{id}")
    @ResponseBody
    public String getStudentAction(@PathVariable String id){

        return this.student.toString();
    }

    @RequestMapping("/school/{id}")
    @ResponseBody
    public String getSchoolAction(@PathVariable String id){

        return this.school.toString();

    }

    @RequestMapping("/test")
    @ResponseBody
    public Map<String, Object> dispatcherParamsAction(@RequestParam Map<String, Object> params){

        this.logger.info(this.random.toString());
        this.logger.info(params.toString());
        return params;
    }




}
