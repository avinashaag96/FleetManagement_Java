package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.HubMaster;


@Repository
@Transactional
public interface HubMasterRepository extends JpaRepository<HubMaster,Integer>
{

}
