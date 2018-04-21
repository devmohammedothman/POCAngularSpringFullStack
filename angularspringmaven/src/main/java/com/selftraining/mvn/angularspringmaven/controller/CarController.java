package com.selftraining.mvn.angularspringmaven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.selftraining.mvn.angularspringmaven.model.Car;
import com.selftraining.mvn.angularspringmaven.service.iCarService;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping ({"/carcrud/car"})
public class CarController {

	
	@Autowired
	private iCarService carService;
	
	@GetMapping
	public ResponseEntity<List<Car>> getAll()
	{
		List<Car> carList = carService.getAll();
		return ResponseEntity.ok().body(carList);
	}
	
	@GetMapping(path = {"/{id}"})
	public ResponseEntity<Car> get(@PathVariable("id") int id)
	{
		Car carObj = carService.get(id);
		return ResponseEntity.ok().body(carObj);
	}
	
	@PostMapping
//	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Car> save(@RequestBody Car carObj)
	{
		carService.save(carObj);
		return ResponseEntity.ok().body(carObj);
	}
	
	@PutMapping
//	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> update(@PathVariable ("id") int id, @RequestBody Car carObj)
	{
		carService.update(id, carObj);
		 return ResponseEntity.ok().body("Book has been updated successfully.");
	}
	
	@DeleteMapping(path = {"/{id}"})
	public ResponseEntity<?> delete(@PathVariable ("id") int id )
	{
		carService.delete(id);
		 return ResponseEntity.ok().body("Book has been deleted successfully.");
	}
	
	
}
