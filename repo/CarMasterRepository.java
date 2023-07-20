package com.example.repo;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.CarMaster;


@Repository
@Transactional
public interface CarMasterRepository extends JpaRepository<CarMaster,Integer>
{

//	@Modifying
//	@Query("update CarMaster c set c.isavailable = :isavailable where c.carid = :id")
//	void update(@Param("isavailable") int isavailable,@Param("id")int id);
	
//	@Modifying
//	@Query("update CarMaster c set c.cardtl = :cardtl,c.isavailable = :isavailable,c.Image_Paths = :Image_Paths where c.carid = :id")
//	void update(@Param("cardtl") String name,@Param("isavailable") String isavailable,@Param("Image_Paths") String Image_Paths,@Param("id")int id);
	
}
