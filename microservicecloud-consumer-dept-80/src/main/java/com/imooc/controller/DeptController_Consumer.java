package com.imooc.controller;

import com.imooc.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Consumer {
//    private static final String REST_URL_PREFIX = "http://localhost:8001";
private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    /**
     * 使用resttemplate访问restful接口非常简单。（url，requestMap，ResponseBean.class）三个
     * 参数分别代表REST请求地址，请求参数，HTTP响应转换的类型
     */
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("/consumer/dept")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept", dept, Boolean.class);
    }
    @GetMapping("/consumer/dept/{id}")
    public Dept get(@PathVariable("id") Integer id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/"+id,Dept.class);
    }
    @GetMapping("/consumer/dept")
    public List<Dept> getAll(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept",List.class);
    }
    @GetMapping("/consumer/dept/discovery")
    public Object discovery(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }
}
