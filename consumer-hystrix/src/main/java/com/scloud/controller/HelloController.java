package com.scloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.scloud.feign.EurekaServiceFeign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private EurekaServiceFeign fegin;
    //调用提供者

    @RequestMapping("hello/{name}")
    @HystrixCommand(fallbackMethod = "fallbackHello")
    public  String show(@PathVariable String name){
      //访问提供者
        return fegin.show(name);

    }
    //失败时断路器自动回调方法
    //方法名字和fallbackMethod名称一致，参数和返回值一致
    public String fallbackHello(String name){
        //设置失败时默认值
        return "tony";
    }

}
