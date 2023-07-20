package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.CarMaster;

@Service
public interface CarMasterManager
{
	List<CarMaster> getCarMaster(); //get all data
	
	//void update(CarMaster carMaster,int cid); //update the data
}
