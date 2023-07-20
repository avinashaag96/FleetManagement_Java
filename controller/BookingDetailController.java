package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.BookingDetail;
import com.example.entity.BookingHeader;
import com.example.service.BookingDetailService;


@RestController
@CrossOrigin("http://localhost:3000")
public class BookingDetailController 
{
	@Autowired
	private BookingDetailService service;
	
	@PostMapping("/api/addBookingDetails")
	public void saveBookingHeader(@RequestBody BookingDetail ref)
	{
		service.save(ref);
	}
	
	@GetMapping("/api/getBookingDetails")
	public List<BookingDetail> getAllBookings()
	{
		return service.getAll();
	}
	
	@GetMapping(value="/api/getBookingDetail/{bookingdetailid}")
	public Optional<BookingDetail> getBookingD(@PathVariable int bookingdetailid)
    {
	Optional<BookingDetail> c=service.getBookingD(bookingdetailid);
	return c;
    }
	
	
	@DeleteMapping(value = "api/deleteBookingDetail/{bookingdetailid}")
	 public void delete(@PathVariable int bookingdetailid)
	 {
		service.delete(bookingdetailid);
	 }
	
	
	
}
