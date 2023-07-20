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


@Entity
@Table(name="InvoiceHeader")
public class InvoiceHeader
{
	
	private int invoiceid;
	private Date date;
	private Date handoverdate;
	private Date startdate;
	private int carid;
	private Date returndate;
	private Date enddate;
	private float rentalamt;
	private float totaladdonamt;
	private float totalamt;
	private BookingHeader bookingheaders;
	private Set<InvoiceDetails> invoicedetails;
	private Customers customers;
	
	public InvoiceHeader() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvoiceHeader(int invoiceid, Date date, Date handoverdate,
			Date startdate, int carid, Date returndate, Date enddate, float rentalamt,
			float totaladdonamt, float totalamt, BookingHeader bookingheaders, Set<InvoiceDetails> invoicedetails, Customers customers ) {
		super();
		this.invoiceid = invoiceid;
		this.date = date;
		this.handoverdate = handoverdate;
		this.startdate = startdate;
		this.carid = carid;
		this.returndate = returndate;
		this.enddate = enddate;
		this.rentalamt = rentalamt;
		this.totaladdonamt = totaladdonamt;
		this.totalamt = totalamt;
		this.invoicedetails = invoicedetails;
		this.bookingheaders=bookingheaders;
		this.customers=customers;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable=true)
	public Customers getCustomers() {
		return customers;
	}
	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(nullable=true)
	public BookingHeader getBookingheaders() {
		return bookingheaders;
	}
	public void setBookingheaders(BookingHeader bookingheaders) {
		this.bookingheaders = bookingheaders;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


	public Date getHandoverdate() {
		return handoverdate;
	}

	public void setHandoverdate(Date handoverdate) {
		this.handoverdate = handoverdate;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	@Column(nullable = true)
	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public Date getReturndate() {
		return returndate;
	}

	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	@Column(nullable = true)
	public float getRentalamt() {
		return rentalamt;
	}

	public void setRentalamt(float rentalamt) {
		this.rentalamt = rentalamt;
	}

	@Column(nullable = true)
	public float getTotaladdonamt() {
		return totaladdonamt;
	}

	public void setTotaladdonamt(float totaladdonamt) {
		this.totaladdonamt = totaladdonamt;
	}

	@Column(nullable = true)
	public float getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(float totalamt) {
		this.totalamt = totalamt;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "invoiceid", referencedColumnName="invoiceid")
	public Set<InvoiceDetails> getInvoicedetails() {
	return invoicedetails;
	}

	public void setInvoicedetails(Set<InvoiceDetails> invoicedetails) {
		this.invoicedetails = invoicedetails;
	}
		
}

