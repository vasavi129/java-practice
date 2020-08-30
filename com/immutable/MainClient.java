package com.immutable;

public class MainClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address addr = new Address();
		addr.setCity("hyderabad");
		addr.setStreet("sr nagar");
		addr.setPincode(500016);
		
		Employee emp = new Employee(1, "vinod", addr);
		
		System.out.println(emp.getId()+","+emp.getName());
		System.out.println(emp.getAddr().getCity());
		
		
		emp.getAddr().setCity("chennai");
		
		System.out.println(emp.getId()+","+emp.getName());
		System.out.println(emp.getAddr().getCity());
		

	}

}
