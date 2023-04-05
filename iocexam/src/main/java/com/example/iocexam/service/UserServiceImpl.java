package com.example.iocexam.service;

import com.example.iocexam.dao.UserDao;
import com.example.iocexam.domain.User;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void joinUser(User user) {
		//회원가입에 필요한 비지니스를 처리하는 로직!!  
		//회원가입이 가능하면 회원정보를 저장하도록 한다. 
		
		//저장하는 로직은 DAO가 구현하고 있으므로 DAO 사용!!  
		userDao.addUser(user);
	}

}
