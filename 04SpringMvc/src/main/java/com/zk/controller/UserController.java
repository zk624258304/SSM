package com.zk.controller;

import com.zk.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/add")
    public void addUser(User user){
        System.out.println("姓名"+user.getName());
        System.out.println("年龄"+user.getAge());
        System.out.println("日期"+user.getBirthday());
    }
    @InitBinder
    public   void  initBinder(WebDataBinder binder){
        System.out.println("1");
        binder.registerCustomEditor(Date.class,new MyDateEditor());
    }
}
