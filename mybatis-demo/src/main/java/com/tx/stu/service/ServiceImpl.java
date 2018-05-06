package com.tx.stu.service;

import com.tx.stu.dao.Dao;

import javax.annotation.Resource;

/**
 * Created by peter.
 */
@org.springframework.stereotype.Service("service")
public class ServiceImpl implements Service {
    @Resource
    private Dao dao;

    @Override
    public String sayHello() {
        return dao.sayHello();
    }

    @Override
    public String otherService() {
        return "other service";
    }
}
