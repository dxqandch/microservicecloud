package com.imooc.service;

import com.imooc.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

/**
 *
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
    @PostMapping("/dept")
    boolean add(Dept dept);
    @GetMapping(value = "/dept/{id}")
    Dept get (@PathVariable("id") Integer id);
    @GetMapping("/dept")
    List<Dept> list();
}
