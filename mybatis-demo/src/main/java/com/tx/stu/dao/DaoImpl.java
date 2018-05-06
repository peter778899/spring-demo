package com.tx.stu.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by peter.
 */
@Repository("dao")
public class DaoImpl implements Dao {
    @Override
    public String sayHello() {
        return "hello by dao";
    }
}
