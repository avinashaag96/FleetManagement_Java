package com.example.repo;

import java.sql.Date;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.BookingHeader;


@Repository
@Transactional
public interface BookingHeaderRepository extends JpaRepository<BookingHeader,Integer>
{

	@Modifying
	  @Query("update BookingHeader bh set bh.startdate= :startdate, bh.enddate= :enddate, bh.pickuplocation= :pickuplocation, bh.dropofflocation= :dropofflocation where bh.bookingid = :bookingid")
	    void update(@Param("startdate") Date startdate,
	                        @Param("enddate") Date enddate,
	                        @Param("pickuplocation") String pickuplocation,
	                        @Param("dropofflocation") String dropofflocation,@Param("bookingid") int bookingid);



	
}
