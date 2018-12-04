package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableDiscoveryClient  //服务发现
@EnableEurekaClient   //自动注册到eureka服务器
@MapperScan("com.imooc.dao")
@SpringBootApplication
@EnableCircuitBreaker  //开启hystrix熔断器
public class DeptPrivider8001Hystrix {
    public static void main(String[] args) {
        SpringApplication.run(DeptPrivider8001Hystrix.class,args);
    }
}
