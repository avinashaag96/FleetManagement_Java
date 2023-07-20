package com.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.CarTypes;


@Repository
@Transactional
public interface CarTypeRepository extends JpaRepository<CarTypes,Integer>
{

}
