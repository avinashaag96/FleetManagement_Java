package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.CarTypes;
import com.example.repo.CarTypeRepository;


@Service
public class CarTypeManagerImpl implements CarTypeManager
{
	@Autowired
	CarTypeRepository repository;
	
	public void addCarTypes(CarTypes c)
	{
		repository.save(c);
	}
	
	public List<CarTypes> getCarTypes1()
	{
		return repository.findAll();
	}
	
	
	public void delete(int id)
	{
		repository.deleteById(id);
	}
	
	/*public void update(CarTypes cartype,int id) {
		
		System.out.println("inside update method of service layer");
		repository.update(cartype.getCarTypeName(),cartype.getDaily_Rate(),cartype.getWeekly_Rate(),cartype.getMonthly_Rate());
    }*/
	
	
	public Optional<CarTypes> getCarTypes(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}
	
}