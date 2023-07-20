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
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers {
	
	private int custId;
	private String fname;
	private String lname;
	private String address;
	private long phoneNum;
	private long alternateNum;
	private String email;
	private String state;
	private String city;
	private int zipCode;
	private Date dateOfbirth;
	private int age;
	private String gender;
	private long adharCardNum;
    private String  passportNum;
    private String passportIssueby;
    private Date passportValidupto ;
    private String drivingLicenceNo ;
    private String drivingLicenceIssueby ;   
    private Date drivingLicenceValidupto ;
    private String  userId ;
    private String password ;
    private int cityid;
    private int state_id;
private Set<BookingHeader> bookings;
    
    
    
	public Customers() {
		super();
	}
	public Customers(int custId, String fname, String lname, String address, long phoneNum, long alternateNum,
			String email, String state, String city, int zipCode, Date dateOfbirth, int age, String gender,
			long adharCardNum, String passportNum, String passportIssueby, Date passportValidupto,
			String drivingLicenceNo, String drivingLicenceIssueby, Date drivingLicenceValidupto, String userId,
			String password, Set<BookingHeader> bookings) {
		super();
		this.custId = custId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phoneNum = phoneNum;
		this.alternateNum = alternateNum;
		this.email = email;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.dateOfbirth = dateOfbirth;
		this.age = age;
		this.gender = gender;
		this.adharCardNum = adharCardNum;
		this.passportNum = passportNum;
		this.passportIssueby = passportIssueby;
		this.passportValidupto = passportValidupto;
		this.drivingLicenceNo = drivingLicenceNo;
		this.drivingLicenceIssueby = drivingLicenceIssueby;
		this.drivingLicenceValidupto = drivingLicenceValidupto;
		this.userId = userId;
		this.password = password;
		this.bookings = bookings;
	}
	
	public Customers(int custId, String fname, String lname, String address, long phoneNum, long alternateNum,
			String email, String state, String city, int zipCode, Date dateOfbirth, int age, String gender,
			long adharCardNum, String passportNum, String passportIssueby, Date passportValidupto,
			String drivingLicenceNo, String drivingLicenceIssueby, Date drivingLicenceValidupto, String userId,
			String password, Set<BookingHeader> bookings, int cityid, int stateid) {
		super();
		this.custId = custId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phoneNum = phoneNum;
		this.alternateNum = alternateNum;
		this.email = email;
		this.state = state;
		this.city = city;
		this.zipCode = zipCode;
		this.dateOfbirth = dateOfbirth;
		this.age = age;
		this.gender = gender;
		this.adharCardNum = adharCardNum;
		this.passportNum = passportNum;
		this.passportIssueby = passportIssueby;
		this.passportValidupto = passportValidupto;
		this.drivingLicenceNo = drivingLicenceNo;
		this.drivingLicenceIssueby = drivingLicenceIssueby;
		this.drivingLicenceValidupto = drivingLicenceValidupto;
		this.userId = userId;
		this.cityid= cityid;
		this.state_id = stateid;
		this.password = password;
		this.bookings = bookings;
	}
	@Column(nullable=true)
	public int getState_id() {
		return state_id;
	}
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	
	@Column(nullable=true)
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public long getAlternateNum() {
		return alternateNum;
	}
	public void setAlternateNum(long alternateNum) {
		this.alternateNum = alternateNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public Date getDateOfbirth() {
		return dateOfbirth;
	}
	public void setDateOfbirth(Date dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getAdharCardNum() {
		return adharCardNum;
	}
	public void setAdharCardNum(long adharCardNum) {
		this.adharCardNum = adharCardNum;
	}
	public String getPassportNum() {
		return passportNum;
	}
	public void setPassportNum(String passportNum) {
		this.passportNum = passportNum;
	}
	public String getPassportIssueby() {
		return passportIssueby;
	}
	public void setPassportIssueby(String passportIssueby) {
		this.passportIssueby = passportIssueby;
	}
	public Date getPassportValidupto() {
		return passportValidupto;
	}
	public void setPassportValidupto(Date passportValidupto) {
		this.passportValidupto = passportValidupto;
	}
	public String getDrivingLicenceNo() {
		return drivingLicenceNo;
	}
	public void setDrivingLicenceNo(String drivingLicenceNo) {
		this.drivingLicenceNo = drivingLicenceNo;
	}
	public String getDrivingLicenceIssueby() {
		return drivingLicenceIssueby;
	}
	public void setDrivingLicenceIssueby(String drivingLicenceIssueby) {
		this.drivingLicenceIssueby = drivingLicenceIssueby;
	}
	public Date getDrivingLicenceValidupto() {
		return drivingLicenceValidupto;
	}
	public void setDrivingLicenceValidupto(Date drivingLicenceValidupto) {
		this.drivingLicenceValidupto = drivingLicenceValidupto;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerid", referencedColumnName="custId",nullable=true)
	public Set<BookingHeader> getBookings() {
		return bookings;
	}
	
	public void setBookings(Set<BookingHeader> bookings) {
		this.bookings = bookings;
	}
	
	@Override
	public String toString() {
		return "Customers [custId=" + custId + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", phoneNum=" + phoneNum + ", alternateNum=" + alternateNum + ", email=" + email + ", state=" + state
				+ ", city=" + city + ", zipCode=" + zipCode + ", dateOfbirth=" + dateOfbirth + ", age=" + age
				+ ", gender=" + gender + ", adharCardNum=" + adharCardNum + ", passportNum=" + passportNum
				+ ", passportIssueby=" + passportIssueby + ", passportValidupto=" + passportValidupto
				+ ", drivingLicenceNo=" + drivingLicenceNo + ", drivingLicenceIssueby=" + drivingLicenceIssueby
				+ ", drivingLicenceValidupto=" + drivingLicenceValidupto + ", userId=" + userId + ", password="
				+ password + "]";
	}

	
	
	

}
