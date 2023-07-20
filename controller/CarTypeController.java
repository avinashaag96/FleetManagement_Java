package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.CarTypes;
import com.example.service.CarTypeManager;

@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class CarTypeController 
{
	@Autowired
	CarTypeManager manager;
	
	@GetMapping(value="api/cartype")
	public List<CarTypes> getCarTypes1()
	{
		return manager.getCarTypes1();
	}
	@GetMapping(value="api/cartypeById/{cartypeid}")
		public Optional<CarTypes> getCarTypes(@PathVariable int cartypeid)
	{
		Optional<CarTypes> c=manager.getCarTypes(cartypeid);
		return c;
	}
	@DeleteMapping(value = "api/cartypes/{cartypeid}")
	 public void delete(@PathVariable int cartypeid)
	 {
		manager.delete(cartypeid);
	 }
	//@PutMapping(value = "api/cartypes/{cartypeid}")
	/* public void updatepro(@RequestBody CarTypes cartypes,@PathVariable int cartypeid)
	 {
		System.out.println("inside update cartype controller");
		manager.update(cartypes,cartypeid);		
	 }*/
	
	@PostMapping(value = "api/addcartype")
	 public void addCarTypes(@RequestBody CarTypes cartype)
	 {
		System.out.println("addpro called");
		manager.addCarTypes(cartype);
	 }
}  
