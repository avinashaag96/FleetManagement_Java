package com.example.repo;


import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Customers;

@Repository
@Transactional
public interface CustomerRepo extends JpaRepository <Customers , Integer>{

	List<Customers> findAll();
	
//	@Query("update Customers p set p.fname = :fname, p.lname=:lname,p.address = :address, p.email=:email ,p.phoneNum=:phoneNum , p.alternateNum=:alternateNum , p.state=:state, p.city=:city, p.zipCode=:zipCode,p.dateOfbirth=:dateOfbirth,p.age=:age,p.gender=:gender,p.adharCardNum=:adharCardNum,p.passportNum=:passportNum,p.passportIssueby=:passportIssueby, p.passportValidupto=:passportValidupto,p.drivingLicenceNo=:drivingLicenceNo,p.drivingLicenceIssueby=:drivingLicenceIssueby, p.drivingLicenceValidupto=:drivingLicenceValidupto,p.userId=:userId,p.password=:password where p.custId = :custId ")
//	void update(@Param("fname") String fname,@Param("lname")String lname,@Param("address") String address,@Param("email") String email,@Param("phoneNum") long phoneNum, @Param("alternateNum") long alternateNum,                @Param("custId")int custId);
//	
   	@Modifying
	  @Query("update Customers c set c.fname = :fname, c.lname = :lname, c.address = :address, c.email = :email, c.phoneNum = :phoneNum, c.alternateNum = :alternateNum, c.state = :state, c.city = :city, c.zipCode = :zipCode, c.dateOfbirth = :dateOfbirth, c.age = :age, c.gender = :gender, c.adharCardNum = :adharCardNum, c.passportNum = :passportNum, c.passportIssueby = :passportIssueby, c.passportValidupto = :passportValidupto, c.drivingLicenceNo = :drivingLicenceNo, c.drivingLicenceIssueby = :drivingLicenceIssueby, c.drivingLicenceValidupto = :drivingLicenceValidupto, c.userId = :userId, c.password = :password where c.custId = :custId")
	    void update(@Param("fname") String fname,
	                        @Param("lname") String lname,
	                        @Param("address") String address,
	                        @Param("email") String email,
	                        @Param("phoneNum") long phoneNum,
	                        @Param("alternateNum") long alternateNum,
	                        @Param("state") String state,
	                        @Param("city") String city,
	                        @Param("zipCode") int zipCode,
	                        @Param("dateOfbirth") Date dateOfbirth,
	                        @Param("age") int age,
	                        @Param("gender") String gender,
	                        @Param("adharCardNum") long adharCardNum,
	                        @Param("passportNum") String passportNum,
	                        @Param("passportIssueby") String passportIssueby,
	                        @Param("passportValidupto") Date passportValidupto,
	                        @Param("drivingLicenceNo") String drivingLicenceNo,
	                        @Param("drivingLicenceIssueby") String drivingLicenceIssueby,
	                        @Param("drivingLicenceValidupto") Date drivingLicenceValidupto,
	                        @Param("userId") String userId,
	                        @Param("password") String password,
	                        @Param("custId") int custId);

	

}

