package com.example.service;

import java.util.List;
import java.util.Optional;

import com.example.entity.City;

public interface CityManager {

    void addCity(City c);
    
    List<City> getCities();
    
    void delete(int id);
    
    void update(City city, int id);
    
    Optional<City> getCity(int id);
    
    List<City> getCitiesByStateId(int id);
    
//    List<City> findByStateId(String cityName);

}

