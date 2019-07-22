package com.springcloud.controller;

import com.springcloud.entity.Student;
import com.springcloud.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestServer testServer;

    @RequestMapping("/getInfo")
    @ResponseBody
    public String getStuInfo(){
       return testServer.getInfo();
    }

    @RequestMapping("/getStudent")
    @ResponseBody
    public Student getStudent(){
        return testServer.getStudent();
    }

    @RequestMapping("/getStudent2")
    @ResponseBody
    public Student getStudent2(){
        return testServer.getStudent2();
    }


}
