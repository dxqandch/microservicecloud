package com.imooc.dao;

import com.imooc.entity.Dept;

import java.util.List;

public interface DeptDao{
    Dept findById(Integer id);
    List<Dept> findAll();
    boolean addDept(Dept dept);
}
