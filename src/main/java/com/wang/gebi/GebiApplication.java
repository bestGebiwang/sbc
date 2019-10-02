package com.wang.gebi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GebiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GebiApplication.class, args);
    }

}
