package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.InvoiceDetails;



public interface InvoiceDetailsManager 
{
	void addInvoiceDetails (InvoiceDetails p);
	List<InvoiceDetails> getInvoiceDetails ();
	Optional<InvoiceDetails> getInvoiceDetailsbyId(int id);
	Optional<List<InvoiceDetails>> findAllByInvoiceHeaderId(int invoiceId);
}
