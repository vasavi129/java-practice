package corejava;

public class Mythread extends Thread {
	public void run()
	{
		for(int i=0; i<5;i++){
			System.out.println("from child thread");
		}

}
}
