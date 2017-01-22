package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UserMapper;
import com.example.entity.User;
import com.example.entity.UserExample;

@Service
public class UserService {
	@Autowired
	private UserMapper userDao;
	
	public List<User> list(){
		return userDao.selectByExample(null);
	}
}

