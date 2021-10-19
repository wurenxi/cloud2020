package com.atguigu.springcloud.myHandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;

/**
 * @description:
 * @author: gxl
 * @createDate: 2021/10/19 12:49
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(444,"客户自定义,global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(444,"客户自定义,global handlerException---2");
    }
}
