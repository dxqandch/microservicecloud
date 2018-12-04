package com.imooc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 */
@EnableDiscoveryClient
@EnableEurekaClient
@MapperScan("com.imooc.dao")
@SpringBootApplication
public class DeptPrivider8002 {
    public static void main(String[] args) {
        SpringApplication.run(DeptPrivider8002.class,args);
    }
}
