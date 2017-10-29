package com.shop.vapor.persistance.repository;

import com.shop.vapor.persistance.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
