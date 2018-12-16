package com.springboot.logback.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by wangjun on 2018/12/16.
 */

@RestController
public class HelloLog {

    private final static Logger logger = LoggerFactory.getLogger(HelloLog.class);



    @RequestMapping(path = "/log1",method = RequestMethod.GET)
    public String log1(){
        logger.warn("ddfdfd");
        return "log";
    }
}
