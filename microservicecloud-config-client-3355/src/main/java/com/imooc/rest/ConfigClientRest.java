package com.imooc.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;
    @Value("${server.port}")
    private String port;
    @RequestMapping(value = "/config",method = RequestMethod.GET)
    private String getConfig(){
        String str="applicationName:"+applicationName+"\t eurekaServers:"+eurekaServers+"'t port:"+port;
        System.out.println("*********Str:" + str);
        return str;
    }
}
