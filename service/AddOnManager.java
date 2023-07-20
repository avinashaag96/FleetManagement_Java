package com.example.service;

import java.util.Optional;

import com.example.entity.AddOn;

import java.util.List;


public interface AddOnManager 
{
   void addAddOn(AddOn a);
   List<AddOn> getAddOns();
   void delete(int id);
   void update(AddOn addon, int id);
   Optional<AddOn> getAddOn(int id);
   List<AddOn> getSelected(String name);
}