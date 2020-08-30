package com.collections;

class TestSyncronized {
	public static void main(String[] args)  { 
		SynchronizedDemo d1=new SynchronizedDemo(); 
		//SynchronizedDemo d2=new SynchronizedDemo(); 
		MyThread t1=new MyThread(d1,"dhoni");  
MyThread t2=new MyThread(d1,"yuvaraj");  
t1.start();  
t2.start();
} 
	
} 
