package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.BookingHeader;
import com.example.entity.CarTypes;
import com.example.entity.Customers;


public interface BookingHeaderService 
{
	void save(BookingHeader ref);
	List<BookingHeader> getAll();
	Optional<BookingHeader> getBooking(int id);
	void delete(int id);
	void update(BookingHeader bh, int id);
//	Optional<BookingHeader> getBooking(int id);
}
