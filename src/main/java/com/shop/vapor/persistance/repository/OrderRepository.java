package com.shop.vapor.persistance.repository;

import com.shop.vapor.persistance.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
