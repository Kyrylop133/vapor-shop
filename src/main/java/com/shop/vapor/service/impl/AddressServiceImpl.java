package com.shop.vapor.service.impl;

import com.shop.vapor.persistance.entity.Address;
import com.shop.vapor.persistance.repository.AddressRepository;
import com.shop.vapor.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> findAll() {
        return addressRepository.findAll();
    }
}
