import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("vasu");

		list.add("vinni");
		list.add("vasvinni");
		// for loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		// iterator method
		Iterator<String> li = list.iterator();
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		// for each

		for (String string : list) {
			System.out.println(string);

		}
	}

}
