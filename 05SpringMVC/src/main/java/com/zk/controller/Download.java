package com.zk.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/downloadFile")
public class Download {
    @RequestMapping("/download")
    public ResponseEntity<byte[]> download()throws IOException {
        String path="/yyy.jpg";
        File file=new File(path);
        HttpHeaders headers = new HttpHeaders();
        String fileName=new String("/yyy.jpg".getBytes("UTF-8"),"iso-8859-1");
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }
}
