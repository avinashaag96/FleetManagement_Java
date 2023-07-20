package com.example.entity;




import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "InvoiceDetails")
public class InvoiceDetails {

    private int invoicedetailsid;
    private float addonamount;
    private AddOn addons;
    private int invoiceid;
   
	public InvoiceDetails() {
        super();
    }


	public InvoiceDetails(int invoicedetailsid, float addonamount, AddOn addons,int invoiceid) {
		super();
		this.invoicedetailsid = invoicedetailsid;
		this.addonamount = addonamount;
		this.addons = addons;
		this.invoiceid = invoiceid;

	}
    
	@Column(nullable=true)
	public int getInvoiceid() {
		return invoiceid;
	}


	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}


	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(nullable=true)
	 public AddOn getAddons() {
		return addons;
	}


	public void setAddons(AddOn addons) {
		this.addons = addons;
	}


	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getInvoicedetailsid() {
		return invoicedetailsid;
	}


	public void setInvoicedetailsid(int invoicedetailsid) {
		this.invoicedetailsid = invoicedetailsid;
	}

	@Column(nullable=true)
	public float getAddonamount() {
		return addonamount;
	}

	public void setAddonamount(float addonamount) {
		this.addonamount = addonamount;
	}



	@Override
	public String toString() {
		return "InvoiceDetails [invoicedetailsid=" + invoicedetailsid + ", addonamount=" + addonamount + "]";
	}

}
