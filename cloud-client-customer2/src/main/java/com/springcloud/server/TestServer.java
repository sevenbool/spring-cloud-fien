package com.springcloud.server;

import com.springcloud.entity.Student;
import com.springcloud.util.HystrixFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "springcloud-customer1",fallbackFactory = HystrixFallbackFactory.class)
public interface TestServer {

    @RequestMapping(value = "/getStudent",produces = "application/json;charset=UTF-8")
    Student getStudent();

    @RequestMapping(value = "/getStudent2",produces = "application/json;charset=UTF-8")
    Student getStudent2();

    @RequestMapping(value = "/getInfo",produces = "application/json;charset=UTF-8")
    String getInfo();
}
