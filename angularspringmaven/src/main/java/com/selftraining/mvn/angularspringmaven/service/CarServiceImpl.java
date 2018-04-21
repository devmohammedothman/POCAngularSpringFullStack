package com.selftraining.mvn.angularspringmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.selftraining.mvn.angularspringmaven.dao.iCarDao;
import com.selftraining.mvn.angularspringmaven.model.Car;

@Service
@Transactional
public class CarServiceImpl implements iCarService{

	@Autowired
	private iCarDao carDao;
	
	
	@Override
	@Transactional
	public int save(Car car) {
		// TODO Auto-generated method stub
		return carDao.save(car);
	}

	@Override
	public Car get(int id) {
		// TODO Auto-generated method stub
		return carDao.get(id);
	}

	@Override
	public List<Car> getAll() {
		// TODO Auto-generated method stub
		return carDao.getAll();
	}

	@Override
	public void update(int id, Car car) {
		// TODO Auto-generated method stub
		carDao.update(id, car);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		carDao.delete(id);
	}

}
