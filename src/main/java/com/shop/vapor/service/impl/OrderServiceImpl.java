package com.shop.vapor.service.impl;

import com.shop.vapor.persistance.entity.Order;
import com.shop.vapor.persistance.repository.OrderRepository;
import com.shop.vapor.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }
}
