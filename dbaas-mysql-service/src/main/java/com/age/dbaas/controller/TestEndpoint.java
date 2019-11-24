package com.age.dbaas.controller;

import com.age.dbaas.entity.TestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/com/age/dbaas/mysql/getHelloMysql")
public class TestEndpoint {

    @GetMapping(value = "/v1.0")
    public TestEntity getHelloRedis(){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1).setMessage("Hello Mysql");
        return testEntity;
    }
}
