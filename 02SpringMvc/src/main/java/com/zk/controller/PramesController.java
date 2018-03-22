package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/params")
public class PramesController {
    @RequestMapping(method = RequestMethod.POST,value = {"a","add","b","haha"},params = {"userName","password"})
    public String addUser(HttpServletRequest request, HttpServletResponse response){
        System.out.println("进入了Add页面");
        System.out.println("用户名"+request.getParameter("userName"));
        System.out.println("密码"+request.getParameter("password"));
        return "success";
    }
}
