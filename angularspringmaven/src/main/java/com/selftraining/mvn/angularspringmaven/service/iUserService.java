package com.selftraining.mvn.angularspringmaven.service;

import java.util.List;

import com.selftraining.mvn.angularspringmaven.model.Car;
import com.selftraining.mvn.angularspringmaven.model.User;

public interface iUserService {
	User save(User user);
	User get(int id);
	List<User> getAll();
	User update (int id , User user);
	User delete(int id);
}
