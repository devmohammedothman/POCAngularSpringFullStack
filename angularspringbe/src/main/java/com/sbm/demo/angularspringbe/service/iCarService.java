package com.sbm.demo.angularspringbe.service;

import java.util.List;

import com.smb.demo.angularspringbe.model.Car;



public interface iCarService {
	int save(Car car);
	Car get(int id);
	List<Car> getAll();
	void update (int id , Car car);
	void delete(int id);
}
