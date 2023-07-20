package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.BookingDetail;
import com.example.entity.BookingHeader;



public interface BookingDetailService 
{
	void save(BookingDetail ref);
	List<BookingDetail> getAll();
	Optional<BookingDetail> getBookingD(int id);
	void delete(int id);
//	void delete(int id);
}
