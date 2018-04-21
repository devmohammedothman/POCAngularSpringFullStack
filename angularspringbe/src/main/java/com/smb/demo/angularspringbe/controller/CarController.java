package com.smb.demo.angularspringbe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbm.demo.angularspringbe.service.iCarService;
import com.smb.demo.angularspringbe.model.Car;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping ({"/car"})
public class CarController {
	
	@Autowired
	private iCarService carService;
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Car> get(@PathVariable("id") int id)
	{
		Car carObj = carService.get(id);
		return ResponseEntity.ok().body(carObj);
	}

}
