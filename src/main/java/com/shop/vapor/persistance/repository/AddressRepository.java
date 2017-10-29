package com.shop.vapor.persistance.repository;

import com.shop.vapor.persistance.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
