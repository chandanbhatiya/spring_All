package com.chandan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandan.dao.UserDao;
import com.chandan.entity.User;

@Service
public class UserServiceImple  implements UserService{

	@Autowired
	private UserDao userDao;
	
	
	public int saveUser(User user) {
		
		
		int i= userDao.save(user);
		return i;
	}
	
	

}
