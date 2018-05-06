package com.tx.stu;

import com.tx.stu.mapper.UserMaper;
import com.tx.stu.models.Order;
import com.tx.stu.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by peter.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMaper userMaper = (UserMaper) context.getBean("userMapper");
        User user = userMaper.getUserById(1);

        System.out.println("获取用户 ID=1 的用户名："+user.getUsername());

        System.out.println("得到用户id为1的所有订单列表:");
        System.out.println("=============================================");
        List<Order> orders = userMaper.getUserOrders(1);

        for (Order order : orders) {
            System.out.println("订单号："+order.getOrderNo() + "，订单金额：" + order.getMoney());
        }
    }
}
