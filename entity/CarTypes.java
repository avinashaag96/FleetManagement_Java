package com.example.entity;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="CarTypes")
public class CarTypes
{
	private int CarTypeId;
	private String CarTypeName;
	private float Daily_Rate;
	private float Weekly_Rate;
	private float Monthly_Rate;
	private String Image_Path;
	
	//onetomany so cartype has many carmasters
	private Set<CarMaster> Cars;
	
public CarTypes()
{
	super();
}

public CarTypes(int CarTypeId,String CarTypeName,float Daily_Rate,
		float Weekly_Rate,float Monthly_Rate,String Image_Path)
{
super();
this.CarTypeId=CarTypeId;
this.CarTypeName=CarTypeName;
this.Daily_Rate=Daily_Rate;
this.Weekly_Rate=Weekly_Rate;
this.Monthly_Rate=Monthly_Rate;
this.Image_Path=Image_Path;
}

public CarTypes(int CarTypeId,String CarTypeName,float Daily_Rate,
		float Weekly_Rate,float Monthly_Rate,String Image_Path,Set<CarMaster> Cars)
{
super();
this.CarTypeId=CarTypeId;
this.CarTypeName=CarTypeName;
this.Daily_Rate=Daily_Rate;
this.Weekly_Rate=Weekly_Rate;
this.Monthly_Rate=Monthly_Rate;
this.Image_Path=Image_Path;
this.Cars=Cars;
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int getCarTypeId()
{
	return CarTypeId;
}
public void setCarTypeId(int CarTypeId) {
	this.CarTypeId = CarTypeId;
}



public String getCarTypeName() {
	return CarTypeName;
}

public void setCarTypeName(String CarTypeName) {
	this.CarTypeName = CarTypeName;
}

public float getDaily_Rate() {
	return Daily_Rate;
}

public void setDaily_Rate(float Daily_Rate) {
	this.Daily_Rate = Daily_Rate;
}

public float getWeekly_Rate() {
	return Weekly_Rate;
}

public void setWeekly_Rate(float Weekly_Rate) {
	this.Weekly_Rate = Weekly_Rate;
}

public float getMonthly_Rate() {
	return Monthly_Rate;
}

public void setMonthly_Rate(float Monthly_Rate) {
	this.Monthly_Rate = Monthly_Rate;
}

public String getImage_Path() {
	return Image_Path;
}

public void setImage_Path(String Image_Path) {
	this.Image_Path = Image_Path;
}

@OneToMany(cascade=CascadeType.ALL)
@JoinColumn(name="cartypeid",referencedColumnName="CarTypeId",nullable = true )
public Set<CarMaster> getCars() {
	return Cars;
}


public void setCars(Set<CarMaster> cars) {
	Cars = cars;
}


@Override
public String toString() {
	return "CarTypes [CarTypeId=" + CarTypeId + ", CarTypeName=" + CarTypeName + ", Daily_Rate=" + Daily_Rate
			+ ", Weekly_Rate=" + Weekly_Rate + ", Monthly_Rate=" + Monthly_Rate + ", Image_Path=" + Image_Path
			+ ", Cars=" + Cars + "]";
}

}

