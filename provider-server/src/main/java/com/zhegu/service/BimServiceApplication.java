package com.zhegu.service;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BimServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BimServiceApplication.class).web(true).run(args);
    }
}
