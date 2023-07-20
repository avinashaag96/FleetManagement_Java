package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.HubMaster;
import com.example.repo.HubMasterRepository;

@Component
@Service
@Qualifier("myImplementation")
public class HubMasterManagerImpl implements HubMasterManager
{

	@Autowired
	HubMasterRepository repository;

	@Override
	public List<HubMaster> getHubMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void addHubMaster(HubMaster hub) {
		// TODO Auto-generated method stub
		repository.save(hub);
	}

	

}
