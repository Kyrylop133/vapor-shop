package com.shop.vapor.service;

import com.shop.vapor.persistance.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> findAll();
}
