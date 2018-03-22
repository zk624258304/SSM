package com.zk.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController extends MultiActionController {
    //新增
    public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
            return new ModelAndView("success","result","新增页面");
    }
    //删除
    public ModelAndView deleteUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","删除页面");
    }
    //新增
    public ModelAndView updateUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","新增页面");
    }
    //新增
    public ModelAndView findUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了add方法");
        return new ModelAndView("success","result","查询页面");
    }
}
