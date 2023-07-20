package com.example.entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table(name="addon")
public class AddOn
{
	public AddOn()
	{
		super();
	}
	
	private int addonId;
	private String addonName;
	private float addonDailyRate;
	private Date rateValidUpto;
//	private Set<BookingDetail> bookingdetails;
//	private Set<InvoiceDetail> invoicedetails;
	
	
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "addonId", referencedColumnName="addonId")
//	public Set<BookingDetail> getBookingdetails() {
//		return bookingdetails;
//	}
	
//	@ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "addonId")
//    private BookingDetail bookingdetail;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "addonId", referencedColumnName="addonId")
//	public Set<InvoiceDetail> getInvoicedetails() {
//		return invoicedetails;
//	}
//
//
//
//	public void setInvoicedetails(Set<InvoiceDetail> invoicedetails) {
//		this.invoicedetails = invoicedetails;
//	}


	public AddOn(int addonId,String addonName, float addonDailyRate,Date rateValidUpto)
	{
		this.addonId = addonId;
		this.addonName = addonName;
		this.addonDailyRate = addonDailyRate;
		this.rateValidUpto = rateValidUpto;
	}
	
	/*public AddOn(int addonId,String addonName, float addonDailyRate,Date rateValidUpto)
	{
		this.addonId = addonId;
		this.addonName = addonName;
		this.addonDailyRate = addonDailyRate;
		this.rateValidUpto = rateValidUpto;
	}*/
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getAddonId()
	{
		return addonId;
	}
	
	public void setAddonId(int addonId)
	{
		this.addonId = addonId;
	}
	
	public String getAddonName()
	{
		return addonName;
	}
	
	public void setAddonName(String addonName)
	{
		this.addonName = addonName;
	}
	
	
	public float getAddonDailyRate()
	{
		return addonDailyRate;
	}
	
	public void setAddonDailyRate(float addonDailyRate)
	{
		this.addonDailyRate = addonDailyRate;
	}
	
	public Date getRateValidUpto()
	{
		return rateValidUpto;
	}
	
	public void setRateValidUpto(Date rateValidUpto)
	{
		this.rateValidUpto = rateValidUpto;
	}
	
	@Override
	public String toString()
	{
		return "AddOn [addonId=" + addonId + ", addonName=" + addonName + ", addonDailyRate=" + addonDailyRate + ", rateValidUpto=" + rateValidUpto +"]";
	};
	
}
