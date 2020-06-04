package com.example.springcloudclientcallerdemo.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/car")
@Configuration
public class CarController {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    // 提供者
    @RequestMapping("/tests")
    public String tests() {
        return "tests";
    }

    // 调用者
    @GetMapping("/cars")
    @ResponseBody
    public String cars() {
        RestTemplate rtl = getRestTemplate();
        return rtl.getForObject("http://users/user/users",String.class);
    }
}
