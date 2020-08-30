package corejava;

import java.util.Comparator;

public class compareByName implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		return o1.getEmpname().compareTo(o2.getEmpname());
	
	}
	

}
