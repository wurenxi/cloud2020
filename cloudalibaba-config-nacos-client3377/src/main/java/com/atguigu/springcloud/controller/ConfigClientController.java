package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/10/18 11:27
 */
@RefreshScope //支持Nacos的动态刷新功能
@RestController
public class ConfigClientController {

    @Value("${com.atguigu.springcloud.config.info}")
    private String configInfo;

    @GetMapping("/config/info")
    public String getConfigInfo(){
        return configInfo;
    }
}
