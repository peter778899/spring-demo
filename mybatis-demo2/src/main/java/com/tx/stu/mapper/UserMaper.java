package com.tx.stu.mapper;

import com.tx.stu.models.Order;
import com.tx.stu.models.User;

import java.util.List;

/**
 * Created by peter.
 */
public interface UserMaper {
    public User getUserById(int userId);
    public List<Order> getUserOrders(int userId);
}
