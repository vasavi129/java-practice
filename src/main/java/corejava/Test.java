package corejava;

public class Test extends Thread {

	public static void main(String[] args) {
		
		Test t = new Test();
		t.start();
		System.out.println("gggg");
	}
	public void run(){
		System.out.println("gggg");
	}
}
