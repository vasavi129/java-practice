package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Student implements Comparator<Student> {//Comparable<Student>,
	private int sId;
	private String sName;
	private double salary;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + sId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (sId != other.sId)
			return false;
		return true;

	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student student1 = new Student();
		student1.setsId(456222);
		student1.setsName("vasavi");
		student1.setSalary(56800.56);

		Student student2 = new Student();
		student2.setsId(46222);
		student2.setsName("vasavireddy");
		student2.setSalary(56800.56);

		Student student3 = new Student();
		student3.setsId(256222);
		student3.setsName("vasavivinod");
		student3.setSalary(56800.56);
		Student student4 = new Student();

		student4.setsId(856222);
		student4.setsName("jhon");
		student4.setSalary(16800.56);

		Student student5 = new Student();
		student5.setsId(556222);
		student5.setsName("sweety");
		student5.setSalary(66800.56);
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		list.add(student5);
		//Set<Student> set = new HashSet<Student>();\
		Set<Student> set = new TreeSet<Student>(new Student());

		
		set.addAll(list);
		//Collections.sort(list);
		System.out.println(set);
		System.out.println(list);


	}

	/*public int compareTo(Student o) {
		if (this.sId > o.sId) {

			return 1;

		} else if (this.sId < o.sId) {
			return -1;

		}

		return 0;
	}*/

	public int compare(Student o1, Student o2) {
	int val = o1.sName.compareTo(o2.sName);
		return val;
	}
}
