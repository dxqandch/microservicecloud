package com.imooc.controller;

import com.imooc.entity.Dept;
import com.imooc.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class DeptController {
    @Qualifier("discoveryClient")
    @Autowired
    private DiscoveryClient client;
    @Autowired
    private DeptService service;
    @PostMapping(value = "/dept")
    public boolean add(Dept dept){
        return  service.add(dept);
}
    @GetMapping(value = "/dept/{id}")
    public Dept get(@PathVariable("id")int id){
        return  service.get(id);
    }
    @GetMapping(value = "/dept")
    public List<Dept> list(){
        return service.list();
    }
    @GetMapping("/dept/discovery")
public Object discovery(){
        List<String> list=client.getServices();
        System.out.println("*************"+list);
    List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
    for (ServiceInstance element:srvList){
        System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
    }
    return this.client;
}
}
