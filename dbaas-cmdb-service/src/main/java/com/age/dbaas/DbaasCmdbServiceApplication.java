package com.age.dbaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DbaasCmdbServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(DbaasCmdbServiceApplication.class, args);
    }

}
