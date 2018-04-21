package com.selftraining.mvn.angularspringmaven.service;

import java.util.List;

import com.selftraining.mvn.angularspringmaven.model.Car;

public interface iCarService {
	int save(Car car);
	Car get(int id);
	List<Car> getAll();
	void update (int id , Car car);
	void delete(int id);
}
