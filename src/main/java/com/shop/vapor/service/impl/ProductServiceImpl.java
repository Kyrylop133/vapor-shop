package com.shop.vapor.service.impl;

import com.shop.vapor.persistance.entity.Product;
import com.shop.vapor.persistance.repository.ProductRepository;
import com.shop.vapor.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
