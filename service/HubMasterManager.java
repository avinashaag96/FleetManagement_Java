package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.entity.HubMaster;

@Service
public interface HubMasterManager 
{
	public List<HubMaster> getHubMaster(); //get all data
	public void addHubMaster(HubMaster hub);
}
