package com.collections;
import java.util.HashSet;
 
public class MyDistElementEx {
 
    public static void main(String a[]){
         
        HashSet<Price> lhm = new HashSet<Price>();
        lhm.add(new Price("Banana", 20));
        lhm.add(new Price("Apple", 40));
        lhm.add(new Price("Orange", 30));
        for (Price price : lhm) {
			
		}
        for(Price pr:lhm){
            System.out.println(pr);
        }
        //Price duplicate = new Price("Banana", 20);
        Price duplicate = new Price("ghgjkl",50);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
    }
}