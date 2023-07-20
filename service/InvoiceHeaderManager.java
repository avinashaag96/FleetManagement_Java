package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.InvoiceHeader;


public interface InvoiceHeaderManager 
{
	void addInvoiceHeader (InvoiceHeader p);
	List<InvoiceHeader> getInvoiceHeader ();
	Optional<InvoiceHeader> getInvoiceHeaderbyId(int id);
	//List<InvoiceHeader> findAllByCustomerId(int customerId);
	 //List<InvoiceHeader> findAllByBookingId(int BookingId); 
}
