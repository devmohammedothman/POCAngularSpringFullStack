package com.selftraining.mvn.angularspringmaven.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.selftraining.mvn.angularspringmaven.model.Car;

@Repository
public class CarDaoImpl implements iCarDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int save(Car car) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(car);
		return car.getId();
	}

	@Override
	public Car get(int id) {
		// TODO Auto-generated method stub
		Car carResult = sessionFactory.getCurrentSession().get(Car.class, id);
		return carResult;
	}

	@Override
	public List<Car> getAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Car.class);
		List<Car> carList = criteria.list();
		 return  carList;
	}

	@Override
	public void update(int id, Car car) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Car carResult = session.byId(Car.class).load(id);
		carResult.setName(car.getName());
		session.flush();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		Car carResult = session.byId(Car.class).load(id);
		session.delete(carResult);
	}

}
