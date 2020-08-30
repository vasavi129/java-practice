package corejava;

import java.util.Arrays;

public class StringArrary {

	public static void main(String[] args) {

		String[] str = new String[]{"java","hello","bye","java","hello","java"};
		String arr[] = {"java","hello","bye","java","hello","java"};
		
		for(String s :arr){
			System.out.println(s);
		}
		System.out.println("after sorting");
		Arrays.sort(arr);
		for(String s :arr){
			System.out.println(s);
		}
		
	}

}
