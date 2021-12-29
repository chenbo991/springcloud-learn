package com.xiangxue.jack.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Scope("refresh")//表示这个类可能会重新实例。再运行的时候，重新实例。
@Slf4j
@RestController
@RequestMapping("/customRefresh")
public class CustomRefreshController {

    @Value("${xx.name:jack}")
    private String name;

    @Autowired
    private Environment environment;

    @RequestMapping("/queryName")
    public String queryName() {
        log.info(this.hashCode()+"");
        log.info("@Value name = " + name);
        log.info("environment name = " + environment.getProperty("xx.name"));

        log.info("environment password = " + environment.getProperty("xx.password"));
        return name + "--->" + environment.getProperty("xx.name");
    }
}
