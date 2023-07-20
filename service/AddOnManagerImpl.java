package com.example.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.AddOn;
import com.example.repo.*;



@Service
public class AddOnManagerImpl implements AddOnManager
{
  @Autowired
  AddOnRepository repository;
  
  @Override
  public void addAddOn(AddOn a)
  {
	  repository.save(a);
  }
  
  @Override
  public List<AddOn> getAddOns()
  {
	  return repository.findAll();
  }
  
  @Override
  public void delete(int id)
  {
	  repository.deleteById(id);
  }
  
  
  @Override
  public void update(AddOn addon, int id)
  {
	  System.out.println("inside update method of service layer");
	  repository.update(addon.getAddonName(), addon.getAddonDailyRate(), addon.getRateValidUpto(),id);
  }
  
  @Override
  public Optional<AddOn> getAddOn(int id)
  {
	  return repository.findById(id);
  }
  
  @Override
  public List<AddOn> getSelected(String name)
  {
	  return repository.listName(name);
  }
}