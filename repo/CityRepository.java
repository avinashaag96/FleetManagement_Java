package com.example.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.City;

@Repository
@Transactional
public interface CityRepository extends JpaRepository<City,Integer>{


	@Modifying
	@Query("update City city set city.cityName = :name where city.cityId = :id")
	void update(@Param("name") String name, @Param("id") int id);

	@Query("SELECT c FROM City c WHERE c.state_id=:id")
	List<City> findByStateId(@Param("id") int id);
	
}	

