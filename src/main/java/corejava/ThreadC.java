package corejava;

public class ThreadC extends Thread{
	int total = 0;
	public void run(){
		
		synchronized(this){
		for(int i = 1; i<=100;i++){
			System.out.println("child ");
			total = total+i;
		}
		System.out.println(" child trying to give notification");
		this.notify();
		}
	}
}
