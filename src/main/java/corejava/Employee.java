package corejava;

import java.util.Date;

public class Employee implements Comparable<Employee>{
	private int empid;
	private String empname;
	private double salary;
	private Date joiningdate;
	
	public Date getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(Date joiningdate) {
		this.joiningdate = joiningdate;
	}

	public Employee(int i, String string, int j) {
		this.empid= i;
		this.empname=string;
		this.salary= j;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + "]";
	}

	public int compareTo(Employee o) {
//return (int) (this.salary- o.salary);
return (int)this.empname.compareTo(o.empname);
	}
	
	
}
