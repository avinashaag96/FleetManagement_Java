package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.BookingHeader;
import com.example.entity.CarTypes;
import com.example.repo.BookingHeaderRepository;



@Service
public class BookingHeaderServiceImpl implements BookingHeaderService
{
	@Autowired
	private BookingHeaderRepository bh_repository;
	@Override
	public void save(BookingHeader ref) 
	{
		bh_repository.save(ref);
	}
	@Override
	public List<BookingHeader> getAll() {
		
		return bh_repository.findAll();
	}
    
	public void delete(int id)
	{
		bh_repository.deleteById(id);
	}

	
	public Optional<BookingHeader> getBooking(int id) {
		// TODO Auto-generated method stub
		return bh_repository.findById(id);
	}
	
	public void update(BookingHeader  bh,int id) {
		// TODO Auto-generated method stub
		System.out.println("inside update method of service layer");
		bh_repository.update(bh.getstartdate(),
				bh.getenddate(),
				bh.getpickuplocation(),
				bh.getdropofflocation(),id);
	}
}
