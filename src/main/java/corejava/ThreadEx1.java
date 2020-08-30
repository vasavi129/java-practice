package corejava;

public class ThreadEx1  extends Thread

{

	public void run() {
		System.out.println("hi this run");
	
		
		// TODO Auto-generated method stub
		
	
	}
	
public static void main(String[] args) {
	ThreadEx1 th = new ThreadEx1();
	//Thread tt = new Thread(th);
	th.start();
	Thread t = new Thread();
	System.out.println(th.getName());
	System.out.println(th.currentThread().getName());
	System.out.println(t.currentThread().getName());
	th.setName("vinod Thread");
	System.out.println(th.getName());
	System.out.println(th.getPriority());
	t.setPriority(MAX_PRIORITY);
	t.setPriority(3);
	System.out.println(t.getPriority());
	
	
	//th.run();
	//tt.run();t.get
	System.out.println("hello this is normal");
}
}
