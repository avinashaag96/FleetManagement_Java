package com.example.service;

import java.util.List;
import java.util.Optional;
import com.example.entity.CarTypes;

public interface CarTypeManager 
{
	void addCarTypes(CarTypes c);
	List<CarTypes> getCarTypes1();
	void delete(int id);
	//void update(CarTypes carType,int id);
	Optional<CarTypes> getCarTypes(int id);
}
