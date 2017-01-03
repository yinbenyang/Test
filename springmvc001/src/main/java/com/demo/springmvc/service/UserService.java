package com.demo.springmvc.service;

import java.util.List;

import com.demo.springmvc.model.User;

public interface UserService {

	User getUserById(int id);
	
	List<User> getUsers();
	
	int insert(User user);
	
}
