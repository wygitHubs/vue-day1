package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class AxsionController {

    @RequestMapping("test")
    @ResponseBody
    public String axions(String id, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        System.out.println(id);
        return "嘻嘻哈哈是个猪";
    }

    //接收post请求
    @RequestMapping("add")
    @ResponseBody
    public User axiosPost(@RequestBody User user, HttpServletResponse response){
        response.setCharacterEncoding("utf-8");
        System.out.println(user);
        return user;
    }
}
