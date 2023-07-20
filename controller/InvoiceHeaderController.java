package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
/*import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;*/
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.InvoiceHeader;
import com.example.service.InvoiceHeaderManager;




@RestController  
//@CrossOrigin("http:127.0.0.1:5500")
public class InvoiceHeaderController {
	
	@Autowired
	InvoiceHeaderManager manager;
	

	@PostMapping(value = "api/InvoiceHeader")
	 public void addCust(@RequestBody InvoiceHeader invo)
	 {
		System.out.println("addInvoiceHeader called");
		manager.addInvoiceHeader(invo);
	 }
	

	 @GetMapping(value = "api/AllInvoiceHeaders")
	 public List<InvoiceHeader> showInvoices()
	 {
		  return manager.getInvoiceHeader(); 	
	 }
	
	 @GetMapping(value = "api/InvoiceHeaderById/{pid}")
	 public Optional<InvoiceHeader> getInvoiceHeader(@PathVariable int pid)
	 {
		Optional<InvoiceHeader> p=manager.getInvoiceHeaderbyId(pid);
		return p;
	 }
	 
	 /*@DeleteMapping(value = "api/DeleteCustomer/{pid}")
	 public void removeCustomer(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }*/

}
