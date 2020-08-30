package com.collections;


import java.util.ArrayList;

import corejava.MainThread;

public class ArrayThreads implements Runnable {
private ArrayList<Integer> arrayList=new ArrayList<Integer>();
	public void run() {
		int i=0;
		for( i=0;i<=10;i++)
		arrayList.add(i);
		System.out.println(Thread.currentThread().getName());
		
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayThreads arrayThread1=new ArrayThreads();
		Thread t1=new Thread(arrayThread1);
		Thread t2=new Thread(arrayThread1);
		System.out.println("in");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println("out");
		System.out.println(Thread.currentThread().getName());
		
		
	}

}

