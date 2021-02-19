package com.client.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {
    @Resource
    private RestTemplate restTemplate;
    //调用提供者
    @RequestMapping("hello/{name}")
    public  String show(@PathVariable String name){
      //访问提供者
      String url="http://localhost:8089/hello/"+name;
      //c替换了使用了eruake动态列表，通过application.name真正找到提供者的nam地址
        url="http://provider-user/hello/"+name;
        return restTemplate.getForObject(url,String.class);

    }

}
