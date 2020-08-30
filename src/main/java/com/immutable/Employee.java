package com.immutable;

/**
 * @author Vinod Kumar
 *
 */
public final class Employee {
private final int id;
private final String name;
private final Address addr;

public Employee(int id, String name, Address addr) {
	this.id = id;
	this.name = name;
	Address a = new Address();
	a.setCity(addr.getCity());
	a.setStreet(addr.getStreet());
	a.setPincode(addr.getPincode());
	
	this.addr = a;
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public Address getAddr() {
	Address ad = new Address();
	ad.setCity(this.addr.getCity());
	ad.setStreet(this.addr.getStreet());
	ad.setPincode(this.addr.getPincode());
	
	return ad;
}

}
