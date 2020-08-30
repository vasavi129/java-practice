package corejava;

import java.util.ArrayList;
import java.util.Collections;

public class InterFaceTest  implements InterFace{
	public static void main(String[] args) {
		System.out.println(InterFace.mystring);
		InterFace i = new InterFaceTest();
		System.out.println(i.mystring);
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"vinod",10000));
		emplist.add(new Employee(2,"ynod",4567));
		emplist.add(new Employee(6,"binod",1234));
		emplist.add(new Employee(3,"finod",7775));
		emplist.add(new Employee(7,"cinod",66452));
		for (Employee employee : emplist) {
			System.out.printf(employee.getEmpid() +"->"+employee.getEmpname()+"->"+employee.getSalary());
			
		}
		System.out.println(emplist);
		
		Collections.sort(emplist);
		Collections.sort(emplist, new compareByName());
		System.out.println(emplist);
	}

}
