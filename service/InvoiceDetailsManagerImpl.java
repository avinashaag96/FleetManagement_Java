package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.InvoiceDetails;
import com.example.repo.InvoiceDetailsRepo;


@Service
public class InvoiceDetailsManagerImpl implements InvoiceDetailsManager
{

	@Autowired
	InvoiceDetailsRepo repository;

	@Override
	public void addInvoiceDetails(InvoiceDetails p) {
		repository.save(p);
		
	}

	@Override
	public List<InvoiceDetails> getInvoiceDetails() {
	
		return repository.findAll();
	}

	@Override
	public Optional<InvoiceDetails> getInvoiceDetailsbyId(int id) {
		
		return repository.findById(id);
	}

	@Override
	public Optional<List<InvoiceDetails>> findAllByInvoiceHeaderId(int invoiceId) {
		
		return repository.findAllByinvoicedetailsid(invoiceId);
	}
	
}