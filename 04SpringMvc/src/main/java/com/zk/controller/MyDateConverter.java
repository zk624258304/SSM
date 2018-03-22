package com.zk.controller;

import org.springframework.beans.TypeMismatchException;
import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class MyDateConverter implements Converter<String,Date> {

    public Date convert(String source) {
        SimpleDateFormat simpleDateFormat=getSimpleDateFormat(source);
        Date date=null;
        try {
            date=simpleDateFormat.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
    private SimpleDateFormat getSimpleDateFormat(String source){
        SimpleDateFormat sdf=null;
        if (Pattern.matches("^\\d{4}/\\d{2}/\\d{2}$",source)){
            sdf=new SimpleDateFormat("yyyy/MM/dd");
        }else if (Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$",source)){
            sdf=new SimpleDateFormat("yyyy-MM-dd");
        }else if (Pattern.matches("^\\d{4}\\d{2}\\d{2}$",source)){
            sdf=new SimpleDateFormat("yyyyMMdd");
        }else {
            throw  new TypeMismatchException("",Date.class);
        }
        return  sdf;
    }
}
