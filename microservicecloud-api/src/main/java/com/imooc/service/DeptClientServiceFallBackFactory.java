package com.imooc.service;

import com.imooc.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {

    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Integer id) {
                return new Dept().setId(id).setName("This id:"+id+"havn't any message,Consumer client offering message:Now,this service has been closed")
                        .setDb_source("no this database in MySql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
