package com.springboot.logback.web;

import com.springboot.logback.IEsRepository;
import com.springboot.logback.MoEsLog;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by wangjun on 2018/12/16.
 */

@RestController
public class HelloLog {

    private final static Logger logger = LoggerFactory.getLogger(HelloLog.class);

    @Autowired
    private IEsRepository esRepository;

    @RequestMapping(path = "/log1",method = RequestMethod.GET)
    public String log1(){
        logger.warn("ddfdfd");
        return "log";
    }



    @RequestMapping(path = "/es-log",method = RequestMethod.GET)
    public void esLog(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        MoEsLog esLog = new MoEsLog();
        esLog.setMessage("你好");
        esLog.setDateTime(simpleDateFormat.format(new Date()));
        esRepository.save(esLog);
    }
}
