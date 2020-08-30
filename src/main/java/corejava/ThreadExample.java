package corejava;

public class ThreadExample  {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getThreadGroup());
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		
		System.out.println(Thread.currentThread().getThreadGroup().getParent());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		//creating new thread new group
		ThreadGroup tr = new ThreadGroup("myGroup");
		System.out.println(tr.getParent());
		System.out.println(tr.getName());
		
		
	}

}
