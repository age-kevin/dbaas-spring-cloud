package com.age.dbaas.controller;

import com.age.dbaas.entity.ResponseBean;
import com.age.dbaas.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dbaas/cmdb/getCmdbTestInfo")
public class TestEndpoint {

    @Autowired
    TestService testService;

    @GetMapping(value = "/v1.0")
    public ResponseBean getCmdbTestInfo(){
        return testService.getCmdbTestInfo();
    }
}
