package corejava;

public class Foo {

	public void print(){
		System.out.println(1);
	}protected void finalize() throws Throwable {
		System.out.println(2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Foo foo = new Foo();
foo.print();
	}

}
