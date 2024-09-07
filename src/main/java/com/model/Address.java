package com.model;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
@Entity
@Embeddable
public class Address {
private String area;
private String city;
private int pincode;
public Address() {
	// TODO Auto-generated constructor stub
}
public Address(String area, String city, int pincode) {
	super();
	this.area = area;
	this.city = city;
	this.pincode = pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
}

}
