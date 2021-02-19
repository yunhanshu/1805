package com.scloud.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value ="provider-user")//跟提供者关联
public interface EurekaServiceFeign {
  //  提供者的Controller //请求的变量名称也需要写
    @RequestMapping(value = "hello/{name}")
    public  String show(@PathVariable("name") String name);
}
