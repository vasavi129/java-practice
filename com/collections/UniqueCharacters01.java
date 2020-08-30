package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class UniqueCharacters01 {

	public static void main(String[] args) {
		String str="ENGI13832NEERING";
		String st=str.trim();
		if(str!=null){
		List<Character> s=new ArrayList<Character>();
		for (int i=0; i<str.length(); i++) {
			s.add(str.charAt(i));
			
		}Collections.sort(s);
		Set<Character> ss=new LinkedHashSet<Character>(s);
		SortedSet<Character> sss=new TreeSet<Character>(s);
         Collections.reverseOrder();
		for (Character c : sss) {
			System.out.println(c);//return c;
			
		}		
		}
		else{
			//return new Hashset();
			
		}
	}
}
