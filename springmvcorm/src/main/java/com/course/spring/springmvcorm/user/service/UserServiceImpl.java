package com.course.spring.springmvcorm.user.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.course.spring.springmvcorm.user.dao.UserDao;
import com.course.spring.springmvcorm.user.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	@Override
	@Transactional
	public int save(User user) {
		return dao.create(user);
	}

	@Override
	public List<User> listUsers() {
		
		List<User> users = dao.findUsers();
		Collections.sort(users);
		return users;
	}

	@Override
	public User findUser(Integer id) {
		return dao.findUser(id);
	}
}
