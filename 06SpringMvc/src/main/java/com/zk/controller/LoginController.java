package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(String userName, HttpSession session){
        System.out.println("进入了login方法");
        session.setAttribute("userName",userName);
        return "forward:/user/main";
    }
}
