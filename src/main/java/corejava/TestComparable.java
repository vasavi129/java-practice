package corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

	public static void main(String[] args) {
		List<Patient> list = new ArrayList<Patient>();
		list.add(new Patient(4565, "vinod", 8099.98));
		list.add(new Patient(7565, "rakesh", 8999.48));
		list.add(new Patient(535, "akshay", 568.58));
		Collections.sort(list, new SortById());

		for (Patient p : list) {
			System.out.println(p);

		}
	}

}
