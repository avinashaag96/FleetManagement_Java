package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.repo.CityRepository;
import com.example.service.CityManager;
import com.example.entity.City;

@RestController
@CrossOrigin("http://Localhost:3000")
public class CityMasterController {


    @Autowired
    CityManager cityManager;

    @GetMapping(value = "/api/cities")
    public List<City> showCities() {
        return cityManager.getCities();
    }

   /* @GetMapping(value = "/api/cities/{cid}")
    public Optional<City> getStateById(@PathVariable int cid) {
        return cityManager.getCity(cid);
    }*/

    @PostMapping(value = "/api/cities")
    public void addState(@RequestBody City city) {
    	System.out.println("Added state");
        cityManager.addCity(city);
    }

    @PutMapping(value = "/api/cities/{sid}")
    public void updateState(@RequestBody City city, @PathVariable int cid) {
        cityManager.update(city, cid);
    }

    @DeleteMapping(value = "/api/cities/{cid}")
    public void deleteState(@PathVariable int cid) {
        cityManager.delete(cid);
    }
   
   @GetMapping(value = "/api/cities/state/{stateId}")
    public List<City> getCitiesByStateId(@PathVariable int stateId) {
        return cityManager.getCitiesByStateId(stateId);
    }
}


