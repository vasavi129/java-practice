package com.immutable;

public class Address {
private String Street;
private String city;
private long pincode;
public String getStreet() {
	return Street;
}
public void setStreet(String street) {
	Street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public long getPincode() {
	return pincode;
}
public void setPincode(long pincode) {
	this.pincode = pincode;
}

}
