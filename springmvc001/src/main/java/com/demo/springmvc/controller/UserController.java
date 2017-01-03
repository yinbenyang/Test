package com.demo.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.springmvc.model.User;
import com.demo.springmvc.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/showUser/{userId}")
	public String showUserInfo(ModelMap modelMap,@PathVariable int userId){
		User user = userService.getUserById(userId);
		modelMap.addAttribute("user", user);
		return "/user/showUserInfo";
	}
	
	@RequestMapping("/showAllUser")
	public @ResponseBody Object showAllUser(){
		List<User> users = userService.getUsers();
		return users;
	}
}
