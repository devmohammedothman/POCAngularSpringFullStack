package com.selftraining.mvn.angularspringmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selftraining.mvn.angularspringmaven.dao.iUserDao;
import com.selftraining.mvn.angularspringmaven.model.User;

@Service
@Transactional
public class UserServiceImpl  implements iUserService{

	@Autowired
	private iUserDao userrDao;
	
	
	@Override
	@Transactional
	public User save(User user) {
		// TODO Auto-generated method stub
		return userrDao.save(user);
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return userrDao.get(id);
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userrDao.getAll();
	}

	@Override
	public User update(int id, User user) {
		// TODO Auto-generated method stub
		return userrDao.update(id, user);
		
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		return userrDao.delete(id);
	}
}
