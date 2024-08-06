package com.FarmWorld.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FarmWorld.Entity.UserAddress;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress,Integer>{

}
