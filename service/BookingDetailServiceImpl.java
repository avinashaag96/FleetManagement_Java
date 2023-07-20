package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.entity.BookingDetail;
import com.example.entity.BookingHeader;
import com.example.repo.BookingDetailRepository;



@Service
public class BookingDetailServiceImpl implements BookingDetailService
{
	@Autowired
	private BookingDetailRepository bd_repository;
	@Override
	public void save(BookingDetail ref) 
	{
		bd_repository.save(ref);
	}
	@Override
	public List<BookingDetail> getAll() {
		
		return bd_repository.findAll();
	}

	public void delete(int id)
	{
		bd_repository.deleteById(id);
	}

	public Optional<BookingDetail> getBookingD(int id) {
		// TODO Auto-generated method stub
		return bd_repository.findById(id);
	}
//	@Override
//	public void delete(int id) {
//		bd_repository.deleteById(id);
//	}
}
