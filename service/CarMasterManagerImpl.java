package com.example.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.CarMaster;
import com.example.repo.CarMasterRepository;

@Component
@Service
@Qualifier("myImplementation")
public class CarMasterManagerImpl implements CarMasterManager
{

	@Autowired
	CarMasterRepository repository;

	@Override
	public List<CarMaster> getCarMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

//	@Override
//	public void update(CarMaster carMaster, int cid) {
//		// TODO Auto-generated method stub
//		System.out.println("inside update method of service layer");
//		repository.update(carMaster.getCardtl(),carMaster.getisavailable(),carMaster.getImage_Paths(),cid);
//		
	
	
}
