package com.synchronize;

public class synchronizedDemo {
	public static void main(String[] args) {
		Display d = new Display();
		Display d2 = new Display();
		MyThread t1=new MyThread(d, "vasavi");
		MyThread t2=new MyThread(d2, "vinod");
		t1.start();
		t2.start();
		
	}

}
