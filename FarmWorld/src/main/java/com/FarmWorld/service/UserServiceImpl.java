package com.FarmWorld.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.FarmWorld.Entity.User;
import com.FarmWorld.Entity.UserAddress;
import com.FarmWorld.Repositories.UserRepository;

@Service("userServiceImpl")
public class UserServiceImpl {
	@Autowired
	private UserRepository userRepository;
	
//	public void saveData() {
//		UserAddress userAddress = new UserAddress();
//		userAddress.setCountry("India");
//		userAddress.setCountry("India");
//		User user = new User();
//		user.setUserName("Mithun");
//		user.setUserEmail("mithun@gmail.com");
//		user.setUserMobileNumber("7702788713");
//		user.setUserAddress(userAddress);
//		
//		userRepository.save(user);
//	}
	
}
