package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entity.BookingHeader;
import com.example.entity.CarTypes;
import com.example.entity.Customers;
import com.example.service.BookingHeaderService;


@RestController
@CrossOrigin("http://127.0.0.1:3000")
public class BookingHeaderController 
{
	@Autowired
	private BookingHeaderService service;
	
	@PostMapping("/api/addBooking")
	public void saveBookingHeader(@RequestBody BookingHeader ref)
	{
		service.save(ref);
	}
	
	@GetMapping("/api/getBooking")
	public List<BookingHeader> getAllBookings()
	{
		return service.getAll();
	}
	
	@GetMapping(value="/api/getBooking/{bookingid}")
	public Optional<BookingHeader> getBooking(@PathVariable int bookingid)
    {
	Optional<BookingHeader> c=service.getBooking(bookingid);
	return c;
    }
	
	
	@DeleteMapping(value = "api/deleteBooking/{bookingid}")
	 public void delete(@PathVariable int bookingid)
	 {
		service.delete(bookingid);
	 }
    
	@PutMapping(value = "api/updateBooking/{bookingid}")
	 public void updatepro(@RequestBody BookingHeader bh,@PathVariable int bookingid)
	 {
		System.out.println("inside updatepro of controller");
		service.update(bh,bookingid);
	 }
//	@GetMapping(value = "api/BookingById/{pid}")
//	 public Optional<BookingHeader> getPro(@PathVariable int pid)
//	 {
//		Optional<BookingHeader> p=service.getBooking(pid);
//		return p;
//	 }
	
}
