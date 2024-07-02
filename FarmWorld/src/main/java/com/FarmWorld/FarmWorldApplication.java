package com.FarmWorld;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.FarmWorld.service.UserServiceImpl;

@SpringBootApplication
public class FarmWorldApplication {
;
	
	public static void main(String[] args) {
//		ConfigurableApplicationContext context = 
				SpringApplication.run(FarmWorldApplication.class, args);
//		UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
//		userServiceImpl.saveData();

	}

}
