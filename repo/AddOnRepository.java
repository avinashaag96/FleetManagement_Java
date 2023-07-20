package com.example.repo;
import java.sql.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.AddOn;

@Repository
@Transactional
public interface AddOnRepository extends JpaRepository<AddOn,Integer>
{
   @Modifying
   @Query("update AddOn a set a.addonName = :name, a.addonDailyRate= :addonDailyRate, a.rateValidUpto = :rateValidUpto where a.addonId = :id")
   void update(@Param("name") String name, @Param("addonDailyRate") float addonDailyRate, @Param("rateValidUpto") Date rateValidUpto, @Param("id")int id);
   
   @Query("from AddOn a where a.addonName = name")
   List<AddOn> listName(@Param("name") String name);
}