package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudClientProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudClientProviderApplication.class, args);
    }

}
