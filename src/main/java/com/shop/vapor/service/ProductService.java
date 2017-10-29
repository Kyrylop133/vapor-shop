package com.shop.vapor.service;

import com.shop.vapor.persistance.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
}
