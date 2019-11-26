package com.age.dbaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DbaasRedisServiceApplication {
        public static void main(String[] args) {
        SpringApplication.run(DbaasRedisServiceApplication.class, args);
    }
}
