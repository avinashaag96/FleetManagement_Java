package com.example.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.BookingDetail;


//@Repository
//@Transactional
public interface BookingDetailRepository extends JpaRepository<BookingDetail, Integer>
{

//	@Modifying
//	@Query("delete from BookingDetail bd where bd.BookingDetailId = :BookingDetailId")
//	void deleteById(@Param("BookingDetailId") int BookingDetailId);

}
