package com.example.entity;

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
@Table(name="carmaster")
public class CarMaster
{
	private int carid;
	private String cardtl;
	private String isavailable;
	private String Image_Paths;
	private int cartypeid; 
	private int hubid;
	
	public CarMaster(int carid, String cardtl, String isavailable, String image_Paths, int cartypeid,int hubid) {
		super();
		this.carid = carid;
		this.cardtl = cardtl;
		this.isavailable = isavailable;
		this.Image_Paths = image_Paths;
		this.cartypeid = cartypeid;
		this.hubid=hubid;
	}


	@Column(nullable=true)
	public int getHubid() {
		return hubid;
	}

	public void setHubid(int hubid) {
		this.hubid = hubid;
	}


	@Column(nullable=true)
	public int getCartypeid() {
		return cartypeid;
	}

	public void setCartypeid(int cartypeid) {
		this.cartypeid = cartypeid;
	}

	public CarMaster()
	{
		
    }

	public String getImage_Paths() {
		return Image_Paths;
	}



	public void setImage_Paths(String image_Paths) {
		Image_Paths = image_Paths;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCardtl() {
		return cardtl;
	}

	public void setCardtl(String cardtl) {
		this.cardtl = cardtl;
	}

	@Column(name="isavailable")
	public String getisavailable() {
		return isavailable;
	}

	
	public void setisavailable(String isavailable) {
		this.isavailable = isavailable;
	}
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "carid", referencedColumnName="carid")
//	public BookingHeader getBookingHeaders() {
//		return BookingHeaders;
//	}

//	public void setBookingHeaders(BookingHeader bookingHeaders) {
//		BookingHeaders = bookingHeaders;
//	}


@Override
public String toString() {
	return "CarMaster [carid=" + carid + ", cardtl=" + cardtl + ", isavailable=" + isavailable + ", Image_Paths="
			+ Image_Paths + "]";
}
}
