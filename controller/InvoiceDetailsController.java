package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.InvoiceDetails;

import com.example.service.InvoiceDetailsManager;


@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class InvoiceDetailsController
{


	@Autowired
	InvoiceDetailsManager manager;
	

	@PostMapping(value = "api/InvoiceDetails")
	 public void addCust(@RequestBody InvoiceDetails invo)
	 {
		manager.addInvoiceDetails(invo);
	 }
	

	 @GetMapping(value = "api/AllInvoiceDetails")
	 public List<InvoiceDetails> showInvoices()
	 {
		  return manager.getInvoiceDetails(); 	
	 }
	
	 @GetMapping(value = "api/InvoiceDetailsById/{pid}")
	 public Optional<InvoiceDetails> getInvoiceDetails(@PathVariable int pid)
	 {
		Optional<InvoiceDetails> p=manager.getInvoiceDetailsbyId(pid);
		return p;
	 }
	 
	 /*@DeleteMapping(value = "api/DeleteCustomer/{pid}")
	 public void removeCustomer(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }*/
}
