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
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="hubmaster")
public class HubMaster
{
	private int hubid;
	private String hubname;
	private String hubaddress;
	private int state_id;
	private int cityid;
	
	private Set<BookingHeader> bookingheaders;
	private Set<CarMaster> carmasters;
	
	public HubMaster(int hubid, String hubname, String hubaddress, int stateid, int cityid) {
		super();
		this.hubid = hubid;
		this.hubname = hubname;
		this.hubaddress = hubaddress;
		this.state_id = stateid;
		this.cityid = cityid;
	}
	
	public HubMaster(int hubid, String hubname, String hubaddress, int stateid, int cityid, Set<CarMaster> carmasters, Set<BookingHeader> bookingheaders) {
		super();
		this.hubid = hubid;
		this.hubname = hubname;
		this.hubaddress = hubaddress;
		this.state_id = stateid;
		this.carmasters =carmasters;
		this.cityid = cityid;
		this.bookingheaders = bookingheaders;
	}
	

//	@OneToOne(cascade = CascadeType.ALL)
//	public BookingHeaderTable getBookingHeaderTables() {
//		return BookingHeaderTables;
//	}
//	public void setBookingHeaderTables(BookingHeaderTable BookingHeaderTables) {
//		this.BookingHeaderTables = BookingHeaderTables;
//	}
//    @Column(name="state_id")
	@Column(nullable=true)
	public int getState_id() {
		return state_id;
	}

	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hubid", referencedColumnName="hubid")
	public Set<BookingHeader> getBookingheaders() {
		return bookingheaders;
	}

	public void setBookingheaders(Set<BookingHeader> bookingheaders) {
		this.bookingheaders = bookingheaders;
	}
   
	@Column(nullable=true)
	public int getCityid() {
		return cityid;
	}

	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
    
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hubid", referencedColumnName="hubid")
	public Set<CarMaster> getCarmasters() {
		return carmasters;
	}

	public void setCarmasters(Set<CarMaster> carmasters) {
		this.carmasters = carmasters;
	}

	
	public HubMaster(){
		super();
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getHubid() {
		return hubid;
	}

	public void setHubid(int hubid) {
		this.hubid = hubid;
	}

	public String getHubname() {
		return hubname;
	}

	public void setHubname(String hubname) {
		this.hubname = hubname;
	}

	public String getHubaddress() {
		return hubaddress;
	}

	public void setHubaddress(String hubaddress) {
		this.hubaddress = hubaddress;
	}
	
}
