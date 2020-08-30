package corejava;

public class ThreaSyncronizedDemo {
	public static void main(String[] args) throws InterruptedException {
   ThreadB b = new ThreadB();
   synchronized(b){
   b.start();
  // b.sleep(1000);
   System.out.println("wait calling");
   b.wait();
   System.out.println("got notify");
	System.out.println(b.total);
   }
	}

}
