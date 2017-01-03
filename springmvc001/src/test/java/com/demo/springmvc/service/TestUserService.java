package com.demo.springmvc.service;


import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.demo.springmvc.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUserService {
	
	private static final Logger log = Logger.getLogger(TestUserService.class);
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testQueryById(){
		User user = userService.getUserById(1);
		log.info(JSON.toJSON(user));
	}
	
	@Test
	public void testInsert(){
		User user = new User();
//		user.setId(3);
		user.setName("Âí³¬");
		user.setPassword("machao");
		int result = userService.insert(user);
		System.out.println(result);
	}
	
	@Test
	public void testQueryAll(){
		List<User> users = userService.getUsers();
		log.info(JSON.toJSON(users));
	}
}
