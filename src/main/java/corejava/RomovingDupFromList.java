/*package corejava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RomovingDupFromList {
	public static void main(String[] args) {
		//collection can hold different types of data
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>(15);
		list.add("hello");
		list.add(1);
		list.add(5.5);
		list.add("hi");list.add("hi");
		list.add("hi");
		list.add("hi");
		list.add("hi");
		list.add("hi");
		list.add("hi");
		list.add("ten");
		Iterator<Object> itt = list.iterator();
		System.out.println("has next "+itt.hasNext());
		System.out.println("next "+itt.next());
		//Third way of rading values from List
		for (int i = 0; i < list.size(); i++) {
			String string = (String) list.get(i);
			System.out.println("legacy for "+string);
		}
		System.out.println();
		System.out.println(list.size());
		for (Object object : list) {
			System.out.println(object);
		}
		
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(1," vinod", 1500));
		l.add(new Employee(2," vinod", 1500));
		l.add(new Employee(1," vinod", 1500));
		l.add(new Employee(3," vinod", 1500));
		//one  way of reading values from List
		for (Employee employee : l) {
			System.out.println(employee);
		}
		//Second way of reading values from List
		Iterator<Employee> itr = l.iterator();
		while(itr.hasNext()){
			Employee e = itr.next();
		System.out.println(e.getEmpid()+","+e.getEmpname()+","+e.getSalary());
		}
		Set<Employee> s = new LinkedHashSet<Employee>(l);
		s.addAll(l);
		l.clear();
		l.addAll(s);
		Iterator<Employee> itr2 = s.iterator();
		while(itr2.hasNext()){
			Employee e1 = itr2.next();
		System.out.println(e1.getEmpid()+","+e1.getEmpname()+","+e1.getSalary());
		}
		
	}

}
*/