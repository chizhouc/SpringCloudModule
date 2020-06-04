package com.example.springcloudclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringcloudclientdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudclientdemoApplication.class, args);
    }

}
