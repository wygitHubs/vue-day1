package com.baizhi.dao;

import com.baizhi.entity.Ems;

import java.util.List;

public interface EmsDao {

    //添加用户
    public void insertByEms(Ems ems);
    //删除用户
    public void deleteById(Integer id);
    //修改用户
    public void updateByEms(Ems ems);
    //查询一个
    public Ems selectByOne(Integer id);
    //查询多个
    public List<Ems> selectAll();
}
