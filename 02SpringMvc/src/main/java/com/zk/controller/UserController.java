package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/model")
public class UserController {
    //新增
    @RequestMapping("/add")
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
            return new ModelAndView("success","result","新增页面");
    }
    //删除
    @RequestMapping("/**/delete")
    public ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","删除页面");
    }
    //新增
    @RequestMapping("/update")
    public ModelAndView updateUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","新增页面");
    }
    //新增
    @RequestMapping("/find")
    public ModelAndView findUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","查询页面");
    }
}
