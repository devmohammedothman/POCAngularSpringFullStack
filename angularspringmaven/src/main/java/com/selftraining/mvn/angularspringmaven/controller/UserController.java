package com.selftraining.mvn.angularspringmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selftraining.mvn.angularspringmaven.model.User;
import com.selftraining.mvn.angularspringmaven.service.UserServiceImpl;
import com.selftraining.mvn.angularspringmaven.service.iUserService;




@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private iUserService userService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.save(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.get(id);
    }

    @PutMapping
    public int update(@RequestBody User user){
        userService.update(user.getId() , user);
        return user.getId();
       }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
       return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.getAll();
    }
}
