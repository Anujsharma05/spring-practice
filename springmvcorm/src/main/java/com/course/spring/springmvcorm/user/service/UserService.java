package com.course.spring.springmvcorm.user.service;

import java.util.List;

import com.course.spring.springmvcorm.user.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> listUsers();
	
	User findUser(Integer id);
}
