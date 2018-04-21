package com.sbm.demo.angularspringbe.service;

import java.util.List;

import com.smb.demo.angularspringbe.model.User;


public interface iUserService {
	User save(User user);
	User get(int id);
	List<User> getAll();
	User update (int id , User user);
	User delete(int id);
}
