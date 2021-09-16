package com.baizhi.action;

import com.baizhi.entity.Ems;
import com.baizhi.service.EmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("ems")
public class EmsController {
    @Autowired
    private EmsService emsService;

    //添加方法
    @RequestMapping("add")
    @ResponseBody
    public void add(@RequestBody Ems ems){
        emsService.addEms(ems);
    }

    //删除方法
    @RequestMapping("delete")
    @ResponseBody
    public void deletes(Integer id){
        emsService.deleteEms(id);
    }

    //修改方法
    @ResponseBody
    @RequestMapping("update")
    public void updates(@RequestBody Ems ems){
        emsService.changeEms(ems);
    }

    //查询单个
    @RequestMapping("queryOne")
    @ResponseBody
    public Ems queryOne(String id){
        System.out.println(id.indexOf(id));
        return emsService.queryOne(id.indexOf(id));
    }

    @RequestMapping("queryAll")
    @ResponseBody
    public List<Ems> queryAll(){
        return emsService.queryAll();
    }
}
