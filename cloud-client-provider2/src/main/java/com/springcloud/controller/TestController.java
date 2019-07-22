package com.springcloud.controller;

import com.springcloud.entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/getStudent")
    public Student getStudent(){
        //调用数据库==将java对象转化json
        return new Student(9,"张大爷","90");
    }

    @RequestMapping("/getInfo")
    public String getInfo(){
        //调用数据库==将java对象转化json
        return "{\"id\":101,\"name\":\"孟美岐\",\"age\":\"19\"}";
    }

}
