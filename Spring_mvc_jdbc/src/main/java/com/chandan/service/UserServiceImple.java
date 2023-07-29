package com.chandan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandan.dao.USerDao;
import com.chandan.entity.User;


@Service
public class UserServiceImple implements UserService {
	
	@Autowired
	private USerDao userDao;

	public int registereUser(User user) {
	
		int i=userDao.saveUser(user);
		return i;
	}
	

}
