package com.tx.stu;

import com.tx.stu.service.Service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by peter.
 */
public class SimpleTest {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Service service = (Service) context.getBean("service");
        System.out.println(service.sayHello());
    }
}
