package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CarMaster;
import com.example.service.CarMasterManager;

import java.util.List;
//import antlr.collections.List;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class CarMasterController
{
	@Autowired
	@Qualifier("myImplementation")
	CarMasterManager manager;
	
	 @GetMapping(value = "/api/carmasters")
	 public List<CarMaster> showCars() 
	 {
		 System.out.println("inside get");
		  return manager.getCarMaster(); 
	 }
	 
	// @PutMapping(value = "/api/carmasters/{cid}, method = RequestMethod.PUT")
	 
//	 @PutMapping(value = "/api/carmasters/{cid}")
//	 public void updatecar(@RequestBody CarMaster car,@PathVariable int cid)
//	 {
//		 System.out.println("inside update of controller");
//		 manager.update(car, cid);
//	 }
}
