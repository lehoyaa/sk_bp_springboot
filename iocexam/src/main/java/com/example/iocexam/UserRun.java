package com.example.iocexam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.iocexam.controller.UserController;

public class UserRun {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("user.xml");
		
		UserController controller = context.getBean(UserController.class);
		
		controller.joinUser();
	}

}
