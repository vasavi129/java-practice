package corejava;

public class BClass extends AClass {
	static int i =0;
	int j = 0;
public void m1(){
	i++;
	j++;
	System.out.println("i "+i +" j"+j);
}
  public static void main(String[] args) {
	  BClass b = new BClass();
	  BClass b1 = new BClass();
	  b.m1();
	  b1.m1();
}
}
