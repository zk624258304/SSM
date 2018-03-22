package com.zk.controller;

public class ceshi {
    static  int a=1;
    static {
        a=10;
        System.out.println("静态代码块1");
    }
    public ceshi(){
        System.out.println("构造器2");
    }

    public static void main(String[] args) {
        System.out.println("主方法3");
        ceshi c=new Child();
    }
}
