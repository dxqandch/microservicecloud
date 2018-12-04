package com.imooc.service;

import com.imooc.entity.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(Integer id);
    List<Dept> list();
}
