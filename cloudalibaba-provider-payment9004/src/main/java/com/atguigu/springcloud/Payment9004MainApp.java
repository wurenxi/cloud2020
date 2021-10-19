package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/10/19 16:10
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9004MainApp {
    public static void main(String[] args) {
        SpringApplication.run(Payment9004MainApp.class,args);
    }
}
