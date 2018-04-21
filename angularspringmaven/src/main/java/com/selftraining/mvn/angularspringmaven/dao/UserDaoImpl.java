package com.selftraining.mvn.angularspringmaven.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selftraining.mvn.angularspringmaven.model.User;

@Repository
public class UserDaoImpl implements iUserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public User save(User user) {
		sessionFactory.getCurrentSession().save(user);
		return user;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		User userResult = sessionFactory.getCurrentSession().get(User.class, id);
		return userResult;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(User.class);
		List<User> userList = criteria.list();
		 return  userList;
	}

	@Override
	public User update(int id, User user) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		User userResult = session.byId(User.class).load(id);
		userResult.setFirstName(user.getFirstName());
		userResult.setLastName(user.getLastName());
		userResult.setEmail(user.getEmail());
		session.flush();
		return user;
		
	}

	@Override
	public User delete(int id) {
		// TODO Auto-generated method stub
		User user = this.get(id);
		Session session = sessionFactory.getCurrentSession();
		User userResult = session.byId(User.class).load(id);
		session.delete(userResult);
		return user;
	}

}
