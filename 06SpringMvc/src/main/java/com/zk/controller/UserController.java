package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/main")
    public ModelAndView mian(){
        System.out.println("进入了main方法");
        ModelAndView modelAndView=new ModelAndView("/success.jsp");
        modelAndView.addObject("welcome","欢迎登陆");
        return modelAndView;
    }
}
