package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.service.UserService;
@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService usrv;
	@RequestMapping("list")
	public List<User> list(){
		return usrv.list();
	}
}
