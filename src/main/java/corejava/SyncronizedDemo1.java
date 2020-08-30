package corejava;

/**
 * @author Vinod Kumar
 *
 */
public class SyncronizedDemo1 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		ThreadC c = new ThreadC();
		
		c.start();
		Thread.sleep(1000);// here it wont get notify bcz it is sleep (1)
		synchronized(c){
			System.out.println("main threas trying to call wait");
		//	c.wait(); 
			c.wait(1000);// then it wait 10 sec then after it will be executed
		System.out.println("main got nitify ");
		System.out.println(c.total);
	}}

}
