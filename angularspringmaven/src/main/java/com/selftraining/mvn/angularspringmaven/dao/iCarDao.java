package com.selftraining.mvn.angularspringmaven.dao;

import java.util.List;

import com.selftraining.mvn.angularspringmaven.model.Car;

public interface iCarDao {

	int save (Car car);
	Car get (int id);
	List<Car> getAll();
	void update(int id , Car car);
	void delete (int id);
}
