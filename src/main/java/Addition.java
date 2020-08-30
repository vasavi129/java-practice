
import java.io.*;

import com.collections.Price; 
   
class Addition{ 
	Price price = null;
      double a =5; 
    // adding two integer values. 
    public static void add(Price a, double d){ 
    	a.setItem("string");
    	Price pri = new Price();
    	pri.setItem("item");
    	System.out.println("price");
    } 
       
    // adding three integer values. 
    public double add(int a, double b){
    	Price pri = new Price();
    	pri.setItem("second item");
    	System.out.println("a data "+a);
           System.out.println("float"+b);
           this.a = a+b;
        return a; 
    } 
    static{
    	System.out.println("static block");
    }
    public static void main (String[] args) { 
        
        Addition ob = new Addition(); 
        Addition ob2 = new Addition(); 
           //read properties file, get the api call flag -> false
       // boolean flag = fase;
        Price price = new Price();
       ob.add(price,2.5); 
       
        System.out.println("sum of the integer,double value :" + price.getItem());
     double sum2 = ob.add(1,2.5); 
      System.out.println("sum of the double integer value :" ); 
          
    }    
} 
   