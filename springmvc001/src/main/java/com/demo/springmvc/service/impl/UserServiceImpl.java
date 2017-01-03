package com.demo.springmvc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.springmvc.dao.UserMapper;
import com.demo.springmvc.model.User;
import com.demo.springmvc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userMapper.selectAll();
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		int result = userMapper.insert(user);
		System.out.println(result);
		return result;
	}

	
}
