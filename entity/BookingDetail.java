package com.example.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
public class BookingDetail 
{	
	private int BookingDetailId;
	private float AddOnRates;
	private AddOn addons;
	private int bookingid;
	/**
	 * 
	 */
	public BookingDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookingDetail(int bookingDetailId, float addOnRates, AddOn addons, int bookingid) {
		super();
		BookingDetailId = bookingDetailId;
		AddOnRates = addOnRates;
		this.addons = addons;
		this.bookingid = bookingid;
	}
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=true)
	public AddOn getAddons() {
		return addons;
	}

	public void setAddons(AddOn addons) {
		this.addons = addons;
	}

	@Column(nullable=true)
	public int getBookingid() {
		return bookingid;
	}

	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getBookingDetailId() {
		return BookingDetailId;
	}
	@Override
	public String toString() {
		return "BookingDetail [BookingDetailId=" + BookingDetailId + ", AddOnRates=" + AddOnRates + "]";
	}
	public void setBookingDetailId(int bookingDetailId) {
		BookingDetailId = bookingDetailId;
	}
	
	@Column(name = "AddOnRates")
	public float getAddOnRates() {
		return AddOnRates;
	}
	public void setAddOnRates(float addOnRates) {
		AddOnRates = addOnRates;
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
	
}

