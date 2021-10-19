package com.atguigu.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.myHandler.CustomerBlockHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/10/19 12:42
 */
@RestController
public class RateLimitController {

    @SentinelResource(value = "byResource",blockHandler = "handlerException")
    @GetMapping("/byResource")
    public CommonResult byResource(){
        return new CommonResult(200,"按资源名称限流测试ok",new Payment(2020L,"serial001"));
    }
    public CommonResult handlerException(BlockException exception){
        return new CommonResult(444,exception.getClass().getCanonicalName()+"\t 服务不可用");
    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
                    blockHandlerClass = CustomerBlockHandler.class,
                    blockHandler = "handlerException")
    public CommonResult customerBlockHandler(){
        return new CommonResult(200,"客户自定义",new Payment(2020L,"serial003"));
    }
}
