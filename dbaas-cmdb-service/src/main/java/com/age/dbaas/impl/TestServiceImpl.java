package com.age.dbaas.impl;

import com.age.dbaas.entity.ResponseBean;
import com.age.dbaas.entity.TestEntity;
import com.age.dbaas.service.TestService;
import com.age.dbaas.service.redis.RedisClientService;
import com.age.dbaas.service.util.RestTemplateApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private RedisClientService redisClientService;

    @Override
    public ResponseBean getCmdbTestInfo() {

        TestEntity testEntity = redisClientService.getHelloRedis("parameter");

        if (testEntity != null) {
            return ResponseBean.actionSuccess(testEntity, "");
        } else {
            return ResponseBean.actionFail("返回结果为空！");
        }
    }
}
