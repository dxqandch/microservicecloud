package com.imooc.controller;


import com.imooc.entity.Dept;
import com.imooc.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService service;
    @PostMapping(value = "/consumer/dept")
    boolean add(Dept dept){
       return service.add(dept);
    }
    @GetMapping(value = "/consumer/dept/{id}")
    Dept get(@PathVariable("id") Integer id){
        return service.get(id);
    }
    @GetMapping("/consumer/dept")
    List<Dept> list(){
        return service.list();
    }
}
