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

import com.example.entity.Customers;
import com.example.service.CustomerManager;


@RestController  
@CrossOrigin("http://127.0.0.1:5500")
public class CustomerController {
	
	@Autowired
	CustomerManager manager;
	
	
	@PostMapping(value = "api/CustAdd")
	 public void addCust(@RequestBody Customers cust)
	 {
		System.out.println("addCustomer called");
		manager.addCustomer(cust);
	 }
	

	 @GetMapping(value = "api/AllCustomers")
	 public List<Customers> showCustomers()
	 {
		  return manager.getCustomers(); 	
	 }
	
	 @GetMapping(value = "api/CustomerById/{pid}")
	 public Optional<Customers> getCustomer(@PathVariable int pid)
	 {
		Optional<Customers> p=manager.getCustomer(pid);
		return p;
	 }
	 
	 @DeleteMapping(value = "api/DeleteCustomer/{pid}")
	 public void removeCustomer(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	 
	 @PutMapping(value = "api/updatecust/{id}")
	 public void updatepro(@RequestBody Customers cust,@PathVariable int id)
	 {
		System.out.println("inside updatepro of controller");
		manager.update(cust,id);
	 }

}

