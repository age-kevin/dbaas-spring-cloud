package com.age.dbaas.impl;

import com.age.dbaas.entity.ResponseBean;
import com.age.dbaas.entity.TestEntity;
import com.age.dbaas.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    public ResponseBean getCmdbTestInfo() {

        //调用Redis服务 TODO
        String action = "http://dbaas-redis-service/dbaas/redis/getHelloRedis/v1.0";
        TestEntity testEntity = restTemplate.getForObject(action, TestEntity.class);

        if (testEntity != null) {
            return ResponseBean.actionSuccess(testEntity, "");
        } else {
            return ResponseBean.actionFail("返回结果为空！");
        }
    }
}
