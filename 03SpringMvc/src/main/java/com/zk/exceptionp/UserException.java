package com.zk.exceptionp;

public class UserException extends RuntimeException {

    public  UserException(){
        super();
    }
    public  UserException(String msg){
        super(msg);
    }


}