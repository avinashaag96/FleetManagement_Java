package com.example.service;


import java.util.*;
import com.example.entity.Customers;

public interface CustomerManager
	{
		void addCustomer(Customers p);
		List<Customers> getCustomers();
		void delete(int id);
		Optional<Customers> getCustomer(int id);
		void update(Customers cust, int id);

	}


