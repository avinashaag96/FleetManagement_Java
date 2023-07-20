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
@Table(name="City")
public class City {
    
    
    private int cityId;
    private String cityName;
    private int state_id;
	private Set<Customers> customers;
	private Set<HubMaster> hubs;
//    @ManyToOne
//    @JoinColumn(name = "stateId", referencedColumnName="stateId")
//    private State state; 
    
    public City() {
		super();

    }
    
    public City(int cityId, String cityName, int stateId) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.state_id = stateId;
	}
    public City(int cityId, String cityName, int stateId,Set<Customers> customers, Set<HubMaster> hubs) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.state_id = stateId;
		this.customers=customers;
		this.hubs = hubs;
	}

    @Column(nullable=true)
	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	@OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "cityid", referencedColumnName="cityId",nullable = true)
	public Set<HubMaster> getHubs() {
		return hubs;
	}

	public void setHubs(Set<HubMaster> hubs) {
		this.hubs = hubs;
	}

	@OneToMany(cascade = CascadeType.ALL)
   	@JoinColumn(name = "cityid", referencedColumnName="cityId",nullable = true)
	public Set<Customers> getCustomer() {
		return customers;
	}

	public void setCustomer(Set<Customers> customer) {
		this.customers = customer;
	}

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable=true)
	public int getCityId() {
        return cityId;
    }
    
    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
    
    public String getCityName() {
        return cityName;
    }
    
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

	
//    public State getState() {
//        return state;
//    }
//    
//    public void setStateMaster(State state) {
//        this.state = state;
//    }
//    
	
    @Override
    public String toString() {
        return "City [cityId=" + cityId + ", cityName=" + cityName + "]";
    }
}

