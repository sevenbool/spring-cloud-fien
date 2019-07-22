package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableEurekaClient  //启动客户端
@EnableFeignClients   //启动feign
@EnableHystrix  //开启熔断支持
@EnableHystrixDashboard
public class CloudClientCustomer1Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientCustomer1Application.class, args);
    }

}
