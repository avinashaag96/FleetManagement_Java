package com.example.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="State")
public class State {
    private int stateId;
    private String stateName;
    private Set<City> city;
    private Set<Customers> customers;
    /* private Set<Airport> airport;*/
     private Set<HubMaster> hub;
    

    public State() {
    	super();
    }
    
    public State(int stateId, String stateName, Set<City> city, Set<Customers> customers, Set<HubMaster> hub) {
    	this.stateId=stateId;
    	this.stateName = stateName;
    	this.city = city;
    	this.customers = customers;
    	/*this.airport=airport;*/
    	this.hub=hub;
    }
    
    public State(int stateId, String stateName) {
    	this.stateId=stateId;
    	this.stateName = stateName;
    	/*this.city = city;
    	this.airport=airport;
    	this.hub=hub;*/
    }
    
    @OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "state_id", referencedColumnName="stateId",nullable = true)
    public Set<Customers> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customers> customers) {
		this.customers = customers;
	}

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
//    @Column(name="state_id")
    public int getStateId() {
        return stateId;
    }
    
    public void setStateId(int stateId) {
        this.stateId = stateId;
    }
    
    public String getStateName() {
        return stateName;
    }
    
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
    
   
    @OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "state_id", referencedColumnName="stateId",nullable = true)
	public Set<City> getCity() {
	return this.city;
	}
    
    public void setCity(Set<City> city) {
    	this.city = city;
    	}
  /*  
    @OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "stateid", referencedColumnName="State_id")
	public Set<Airport> getAirport() {
	return this.city;
	}
    
    public void setAirport(Set<Airport> airport) {
    	this.airport = airport;
    	}
    
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "stateid", referencedColumnName="State_id")
	public Set<Customers> getCustomer() {
	return this.customer;
	}
	
	public void setCustomer(Set<Customers> customer) {
	this.customer = customer;
	}*/
    
    @OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "state_id", referencedColumnName="stateId",nullable = true)
	public Set<HubMaster> getHub() {
	return this.hub;
	}
    
    public void setHub(Set<HubMaster> hub) {
    	this.hub = hub;
    	}
    
    
    
    
    
    @Override
    public String toString() {
        return "State_Master [stateId=" + stateId + ", stateName=" + stateName + "]";
    }
}

