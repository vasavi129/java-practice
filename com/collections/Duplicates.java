package com.collections;

/**
 * @author Vinod Kumar Finding the duplicate Elements
 */
public class Duplicates {
	public static void main(String[] args) {
		// String[] str = new
		// String[]{"java","hello","bye","java","hello","java"};
		//one type of initialization
		int[] str = new int[] { 1, 4, 2, 3, 5, 1, 5, 6, 3, 23, 5, 3 };
		// String[] str2= new String[str.length];
System.out.println("length " +str.length);
//second type of initialization
		int[] str2 = new int[str.length];
		 str2[1] = 6;
		 str2[13]=9;
		//int[] str = new int[]{};
		
		for (int i = 0; i < str.length; i++) {//i=0,1,2
			boolean flag = true;
			for (int j = i + 1; j < str.length; j++) {//j=1,2,3
				// if(str[i].equals(str[j])){
				if (str[i] == str[j] && str[j] != 0) {
					str[j] = 0;
					flag = false;
					break;
					
				}
				
			}//end of second for loop
			if (flag == false)
				str2[i] = str[i];
			//str2[0] = 8;
		}
		for (int m = 0; m < str2.length; m++) {
			if (str2[m] != 0)
				System.out.println(str2[m]);
		}
	}
}