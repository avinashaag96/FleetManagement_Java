package com.example.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Customers;
import com.example.repo.CustomerRepo;
import java.util.*;

@Service
public class CustomerManagerImpl implements CustomerManager {
	
	@Autowired
	CustomerRepo repository;
	
	
	@Override
	public void addCustomer(Customers p) {
		repository.save(p);
		
	}

	@Override
	public List<Customers> getCustomers() {
		// TODO Auto-generated method stub
		return repository.findAll();	
		
	}

	@Override
	public void delete(int id) {
		repository.deleteById(id);
	}

	
	@Override
	public Optional<Customers> getCustomer(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	

	public void update(Customers  cust,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		repository.update(cust.getFname(),
				cust.getLname(),
				cust.getAddress(),
				cust.getEmail(),
				cust.getPhoneNum(),
				cust.getAlternateNum(),
				cust.getState(),
				cust.getCity(),
				cust.getZipCode(),
				cust.getDateOfbirth(),
				cust.getAge(),
				cust.getGender(),
				cust.getAdharCardNum(), 
				cust.getPassportNum(),
				cust.getPassportIssueby(),
				cust.getPassportValidupto(),
				cust.getDrivingLicenceNo(),
				cust.getDrivingLicenceIssueby(),
				cust.getDrivingLicenceValidupto(),
				cust.getUserId(),
				cust.getPassword(),
				id);
	}


}

