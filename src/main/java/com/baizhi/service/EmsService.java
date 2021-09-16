package com.baizhi.service;

import com.baizhi.entity.Ems;

import java.util.List;

public interface EmsService {
    //添加
    public void addEms(Ems ems);

    //删除
    public void deleteEms(Integer id);

    //修改
    public void changeEms(Ems ems);

    //查询单个
    public Ems queryOne(Integer id);

    //查询多个
    public List<Ems> queryAll();
}
