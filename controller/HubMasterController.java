package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.HubMaster;
import com.example.service.HubMasterManager;



@RestController
public class HubMasterController 
{
	@Autowired
	@Qualifier("myImplementation")
	HubMasterManager manager;
	
	 @GetMapping(value = "/api/gethubmaster")
	 public List<HubMaster> showHubs() 
	 {
		 System.out.println("inside get");
		  return manager.getHubMaster(); 
	 }
	
	 @PostMapping(value = "/api/addhubmaster")
	 public void addHubMaster(@RequestBody HubMaster hub)
	 {
		 System.out.println("addHub called");
			manager.addHubMaster(hub);
	 }
}
