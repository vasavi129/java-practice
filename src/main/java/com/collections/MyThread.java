package com.collections;

/**
 * @author Vinod Kumar
 *
 */

class MyThread extends Thread { 
	SynchronizedDemo d;  String name;
	MyThread(SynchronizedDemo d,String name)  { 
		this.d=d;  
		this.name=name; 
	}

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	public void run()  {
		d.wish(name);
		d.wish1(name);
	}
}
