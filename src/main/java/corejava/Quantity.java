package corejava;

import java.util.HashSet;
import java.util.Set;

public class Quantity {
	
    public int id;
    public String name;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	final int amount;
	Quantity(int amount){
		this.amount=amount;
	}
	public boolean equals(Object o){
		if(this == o){
			System.out.println("in equals");
			return true;
		}
		System.out.println("in equals");
		Quantity q= (Quantity)o;
		return id ==q.id;
	}
	public static void main(String[] args) {
		Quantity q = new Quantity(2);
		Quantity q1 = new Quantity(2);
		q1.setId(1);
		q1.setName("vinod");
		q.setId(1);
		q.setName("vinod");
		Set<Quantity> set= new HashSet<Quantity>();
		Set<String> set1= new HashSet<String>();
		System.out.println(set1.toString());
		System.out.println("adding set1");
		set.add(q);
		System.out.println("adding set2");
		set.add(q1);
		System.out.println(set.contains(q)+","+set.contains(q1));
		for (Quantity string : set) {
			System.out.println("in loop");
			System.out.println(string.getName().toString());
			
		}
	}
}

