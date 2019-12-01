package com.age.dbaas.service.redis;

import com.age.dbaas.entity.TestEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 调用Redis服务接口
 */
@FeignClient(name = "dbaas-redis-service")
public interface RedisClientService {

    @GetMapping("/dbaas/redis/getHelloRedis/v1.0")
    TestEntity getHelloRedis(@RequestParam(value = "parameter") String parameter);
}
