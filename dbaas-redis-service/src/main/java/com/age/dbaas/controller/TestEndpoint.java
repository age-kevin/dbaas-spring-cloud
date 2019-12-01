package com.age.dbaas.controller;

import com.age.dbaas.entity.TestEntity;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dbaas/redis/getHelloRedis")
public class TestEndpoint {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/v1.0")
    public TestEntity getHelloRedis(String parameter){
        TestEntity testEntity = new TestEntity();
        testEntity.setId(1).setMessage("端口：" + port + ", 参数：" + parameter);
        return testEntity;
    }
}
