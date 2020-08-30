package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class HashMapp {
	public static void main(String[] args) {
 Map<String,String> map = new  HashMap<String, String>();
	      map.put("1", "vinod");
	      map.put("5", "vinod");
	      map.put("3", "vinod");
	      map.put("2", "vinod");
	 Map<String,String> map1 = new  HashMap<String, String>();
	      
	     Set<String> d = map.keySet();
	     Iterator<String> itr = d.iterator();
	     
	      Set<Entry<String, String>> dd = map.entrySet();
        
         
       Iterator<Entry<String, String>> itrr = dd.iterator();
       
	      for (String string : map.keySet()) {
			
	    	  System.out.println(map.get(string));
		}
	      
	     map.remove(map);
	     
	      
	}
	
	

}
