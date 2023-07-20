package com.example.entity;

import java.sql.Date;
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

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class BookingHeader 
{
	/**
	 * 
	 */
	public BookingHeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private int bookingid;
	private Date bookingdate;
	private Date startdate;
	private Date enddate;
	private Set<BookingDetail> bookingdetails;
	private CarMaster carmasters;
	private CarTypes cartypesi;
	private int customerid;
	private String pickuplocation;
	private String dropofflocation;
	private int hubid;
	
	public BookingHeader(int bookingid, Date bookingdate, Date startdate, Date enddate, CarMaster carmasters, CarTypes cartypesi,int customerid, String pickuplocation,String dropofflocation) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.startdate = startdate;
		this.enddate = enddate;
		this.carmasters = carmasters;
		this.cartypesi = cartypesi;
		this.customerid=customerid;
		this.pickuplocation=pickuplocation;
		this.dropofflocation=dropofflocation;
	}
	
	public BookingHeader(int bookingid, Date bookingdate, Date startdate, Date enddate, CarMaster carmasters, CarTypes cartypesi,int customerid, String pickuplocation,String dropofflocation, int hubid,Set<BookingDetail> bookingdetails) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.startdate = startdate;
		this.enddate = enddate;
		this.carmasters = carmasters;
		this.cartypesi = cartypesi;
		this.customerid=customerid;
		this.pickuplocation=pickuplocation;
		this.dropofflocation=dropofflocation;
		this.hubid = hubid;
		this.bookingdetails = bookingdetails;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="bookingid", referencedColumnName = "bookingid",	nullable = true)
	public Set<BookingDetail> getBookingdetails() {
		return bookingdetails;
	}

	public void setBookingdetails(Set<BookingDetail> bookingdetails) {
		this.bookingdetails = bookingdetails;
	}

	@Column(nullable=true)
	public int getHubid() {
		return hubid;
	}

	public void setHubid(int hubid) {
		this.hubid = hubid;
	}

	public String getpickuplocation() {
		return pickuplocation;
	}

	public void setpickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}

	public String getdropofflocation() {
		return dropofflocation;
	}

	public void setdropofflocation(String dropofflocation) {
		this.dropofflocation = dropofflocation;
	}

//	@OneToOne(cascade = CascadeType.ALL)
//	public HubMaster gethubmasters() {
//		return hubmasters;
//	}
//
//	public void sethubmasters(HubMaster hubmasters) {
//		hubmasters = hubmasters;
//	}

	@Column(nullable=true) 
	public int getcustomerid() {
		return customerid;
	}

	public void setcustomerid(int customerid) {
		this.customerid = customerid;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable=true)
	public CarTypes getcartypesi() {
		return cartypesi;
	}

	public void setcartypesi(CarTypes cartypesi) {
		cartypesi = cartypesi;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable=true)
//	@JoinColumn(name="CarTypeId", referencedColumnName = "CarTypeId")
	public CarMaster getcarmasters() {
		return carmasters;
	}



	public void setcarmasters(CarMaster carmasters) {
		carmasters = carmasters;
	}



	@Override
	public String toString() {
		return "BookingHeader [bookingid=" + bookingid + ", bookingdate=" + bookingdate + ", startdate=" + startdate
				+ ", enddate=" + enddate + ", bookingdetails=" + bookingdetails + "]";
	}
	/**
	 * @param proid
	 * @param proname
	 * @param category
	 * @param quantity
	 * @param price
	 */
	
	
	/**
	 * @return the proid
	 */
	
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getbookingid() {
		return bookingid;
	}

	public void setbookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	@Column(name = "bookingdate")
	public Date getbookingdate() {
		return bookingdate;
	}

	public void setbookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	@Column(name = "startdate")
	public Date getstartdate() {
		return startdate;
	}

	public void setstartdate(Date startdate) {
		this.startdate = startdate;
	}
	@Column(name = "enddate")
	public Date getenddate() {
		return enddate;
	}

	public void setenddate(Date enddate) {
		this.enddate = enddate;
	}

	
	
}

