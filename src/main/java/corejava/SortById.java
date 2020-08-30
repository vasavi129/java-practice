package corejava;

import java.util.Comparator;

public class SortById implements Comparator<Patient> {

	public int compare(Patient o1, Patient o2) {
		int val = o1.compareTo(o2);
		return val;
	}

}
