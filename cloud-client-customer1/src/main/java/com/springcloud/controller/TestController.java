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
    public String getStuInfo(){
       return testServer.getInfo();
    }

    @RequestMapping("/getStudent")
    public Student getStudent(){
        return testServer.getStudent();
    }

    @RequestMapping("/getStudent2")
    public Student getStudent2(){
        Student stu=new Student(111,"qwer","123");
        return stu;
    }


}
