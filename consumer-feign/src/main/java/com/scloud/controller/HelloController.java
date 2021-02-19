package com.scloud.controller;

import com.scloud.feign.EurekaServiceFeign;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private EurekaServiceFeign fegin;
    //调用提供者
    @RequestMapping("hello/{name}")
    public  String show(@PathVariable String name){
      //访问提供者
        return fegin.show(name);

    }

}
