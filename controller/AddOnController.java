package com.example.controller;

import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.AddOn;
import com.example.service.AddOnManager;


@RestController
/*@CrossOrigin("http://127.0.0.1:3000")*/
public class AddOnController 
{
	
   @Autowired
   AddOnManager manager;
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @GetMapping(value = "api/getaddons")
   public List<AddOn> showAddOns()
   {
	   return manager.getAddOns();
   }
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @GetMapping(value = "api/addonsById/{aid}")
   public Optional<AddOn> getAdd(@PathVariable int aid)
   {
	   Optional<AddOn> a = manager.getAddOn(aid);
	   return a;
   }
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @GetMapping(value = "api/addonsByName/{name}")
   public List<AddOn> getAddName(@PathVariable String name)
   {
	   return manager.getSelected(name);
   }
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @DeleteMapping(value = "api/addons/{aid}")
   public void removeadd(@PathVariable int aid)
   {
	   manager.delete(aid);
   }
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @PutMapping(value = "api/addons/{aid}")
   public void updateadd(@RequestBody AddOn addon, @PathVariable int aid)
   {
	   System.out.println("inside updateadd of controller");
	   manager.update(addon,aid);
   }
   
   @CrossOrigin(origins="*",allowedHeaders="*")
   @PostMapping(value = "api/addaddons")
   public void addadd(@RequestBody AddOn addon)
   {
	   System.out.println("addadd called");
	   manager.addAddOn(addon);
   }
}