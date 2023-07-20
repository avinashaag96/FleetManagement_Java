package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.CityRepository;
import com.example.service.CityManager;
import com.example.entity.City;

@Service
public class CityManagerImpl implements CityManager {


    @Autowired
     CityRepository repository;
    
   
    @Override
    public void addCity(City c) {
        repository.save(c);
    }

 /*   @Override
    public List<City> getCities() {
        return repository.findAll();
    }*/
    

    @Override
    public void delete(int id) {
        repository.deleteById(id);
    }

    @Override
    public void update(City city, int id) {
        repository.update(city.getCityName(), id);
    }

    @Override
    public Optional<City> getCity(int id) {
        return repository.findById(id);
        
    }

	@Override
	public List<City> getCities() {
		// TODO Auto-generated method stub
		return null;
	
	}
    
    public List<City> getCitiesByStateId(int stateId) {
        return repository.findByStateId(stateId);
    }
    
}