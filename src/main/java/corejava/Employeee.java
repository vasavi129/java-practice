package corejava;

public class Employeee {
	private int empId;
	private String empName;
	private double empSal;
	public Employeee(int empId, String empName, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
	}
	@Override
	public String toString() {
		return "Employeee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	
}
