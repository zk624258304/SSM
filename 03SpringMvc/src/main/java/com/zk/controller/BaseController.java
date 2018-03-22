package com.zk.controller;

import com.zk.exceptionp.AgeException;
import com.zk.exceptionp.NameException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

public class BaseController {
    @ExceptionHandler(NameException.class)
    public ModelAndView nameException(NameException ex){
        ModelAndView modelAndView=new ModelAndView("/errors/nameException.jsp");
        modelAndView.addObject("ex",ex);
        return modelAndView;
    }
    @ExceptionHandler(AgeException.class)
    public ModelAndView  nameException(AgeException ex){
        ModelAndView  mv=new ModelAndView("/errors/ageException.jsp");
        mv.addObject("ex",ex);
        return  mv;
    }

    /**
     * 除了上面的name和age异常之外的其他异常进入此方法
     */
    @ExceptionHandler
    public ModelAndView  defaultException(Exception ex){
        ModelAndView  mv=new ModelAndView("/errors/defaultError.jsp");
        mv.addObject("ex",ex);
        return  mv;
    }
}
