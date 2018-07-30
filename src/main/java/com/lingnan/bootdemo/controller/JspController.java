package com.lingnan.bootdemo.controller;


import com.lingnan.bootdemo.bean.LearnResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Jsp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * jsp输出控制器
 */
@Controller
@RequestMapping("/jsp")
public class JspController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private LeafController leafController;


    @RequestMapping("")
    public String index(Model model){
        this.logger.info("---------------fdfddf----------");
        return this.leafController.index(model);
    }
}
