package com.age.dbaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DbaasEurekaServer7003Application {
    public static void main(String[] args) {
        SpringApplication.run(DbaasEurekaServer7003Application.class, args);
    }
}
