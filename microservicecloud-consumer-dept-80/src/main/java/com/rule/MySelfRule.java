package com.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
        return new ReWriteRandom();
    }
}

