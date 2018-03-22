package com.zk.controller;

import com.zk.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/haha")
    public ModelAndView haha(String name,int age){
        System.out.println("进入了haha");
        System.out.println("学生姓名"+name);
        System.out.println("学生年龄加一"+(age+1));
        ModelAndView modelAndView=new ModelAndView("studentSuccess");
        modelAndView.addObject("name",name).addObject("age",age);
        return modelAndView ;
    }
    @RequestMapping("/xixi")
    public ModelAndView xixi(Student student){
        System.out.println("进入了haha");
        System.out.println("学生姓名"+student.getName());
        System.out.println("学生年龄加一"+(student.getAge()+1));
        System.out.println("老师姓名"+student.getTeacher().getName());
        System.out.println("老师年龄加一"+(student.getTeacher().getAge()+1));
        ModelAndView modelAndView=new ModelAndView("studentSuccess");
        modelAndView.addObject("student",student);
        return modelAndView ;
    }
}
