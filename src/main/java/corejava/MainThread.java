package corejava;

public class MainThread extends Thread{
	
	public void run()
	{
		for(int i=0; i<5;i++){
			System.out.println("from child thread");
			//Thread.yield();
		}

}
	public static void main(String[] args) throws InterruptedException {
		
		//Mythread m = new Mythread();
		MainThread m =new MainThread();
		m.start();
		//m.start();
	//	m.join();
		
		for(int i=0; i<5;i++){
			System.out.println("fromm main thread");
			
		}
	}

}
