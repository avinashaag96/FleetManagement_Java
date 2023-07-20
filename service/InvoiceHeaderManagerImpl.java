package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.entity.InvoiceHeader;
import com.example.repo.InvoiceHeaderRepo;


@Service
public class InvoiceHeaderManagerImpl implements InvoiceHeaderManager 
{

	@Autowired
	InvoiceHeaderRepo repository;
	
	@Override
	public void addInvoiceHeader(InvoiceHeader p) {
		repository.save(p);
	}

	@Override
	public List<InvoiceHeader> getInvoiceHeader() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Optional<InvoiceHeader> getInvoiceHeaderbyId(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
	/*public List<InvoiceHeader> findAllByCustomerId(int customerId) {
        return repository.findByCustomerId(customerId);
*/
}
