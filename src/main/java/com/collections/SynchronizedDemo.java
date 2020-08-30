package com.collections;

class SynchronizedDemo { 
	public  synchronized void wish(String name)  {
		
	for(int i=0;i<3;i++)   { 
		System.out.print("good morning:"); 
		/*try    {     Thread.sleep(1000);    
		}
		catch (InterruptedException e)  
		{} */    System.out.println(name);
		System.out.println("wish");
		}  
	} 
	public  synchronized void wish1(String name)  {
		
		for(int i=0;i<3;i++)   { 
			System.out.print("good morning:"); 
			/*try    {     Thread.sleep(1000);    
			}
			catch (InterruptedException e)  
			{}  */
			System.out.println(name);
			System.out.println("wish1");
			}  
		} 
} 


