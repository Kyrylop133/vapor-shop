package com.shop.vapor.service;

import com.shop.vapor.persistance.entity.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
}
