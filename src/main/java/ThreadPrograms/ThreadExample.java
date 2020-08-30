package ThreadPrograms;

public class ThreadExample extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");

		}
	}

	public static void main(String[] args) {
		ThreadExample example = new ThreadExample();
		example.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}
}