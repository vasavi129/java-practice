package corejava;

public class TestClass {
	int b =5;
	public static int m1(int a){
		return a;
	}

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());
		
		// TODO Auto-generated method stub
		int f =TestClass.m1(3);
	TestClass obj= new  TestClass();
		System.out.println(obj.getClass());
System.out.println(f);
//System.exit(1);
System.gc();
System.out.println(System.currentTimeMillis());

	}

}
