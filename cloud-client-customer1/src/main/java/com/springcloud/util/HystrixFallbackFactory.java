package com.springcloud.util;

import com.springcloud.entity.Student;
import com.springcloud.server.TestServer;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;


@Component
public class HystrixFallbackFactory implements FallbackFactory<TestServer> {

    @Override
    public TestServer create(Throwable throwable) {
        System.out.println("**提供方出错**...**启动熔断**");

        return
                new TestServer() {
            @Override
            public Student getStudent() {
                return new Student();
            }

            @Override
            public String getInfo() {
                return "";
            }
        };
    }
}
