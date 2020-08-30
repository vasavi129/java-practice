package corejava;

public class Fruit {
	final String name;
	public Fruit(String name){
		this.name=name;
	}
	public void print(){
		System.out.println(String.format("this is fruit"+name));
	}

}

