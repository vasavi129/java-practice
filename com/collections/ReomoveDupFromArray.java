package com.collections;

import java.util.Set;

public class ReomoveDupFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] str = new String[]{"java","hello","bye","java","hello","java"};
String[] str3 = new String[str.length];
 str3=uniqueElememts(str);
 for(int m=0;m<str3.length;m++){
		if(str3[m]!=null)
	System.out.println(str3[m]);
 }

String[] str2= new String[str.length];

for(int i =0;i<str.length;i++){
	boolean flag=true;
for(int j=i+1;j<str.length;j++){
		if(str[i]==str[j]){
		flag = false;
	break;
		}
}if(flag==true)
	str2[i]=str[i];
}
for(int m=0;m<str2.length;m++){
	if(str2[m]!=null)
System.out.println(str2[m]);
	}}

	public static String[] uniqueElememts(String[] str) {
		// TODO Auto-generated method stub
		String[] str2= new String[str.length];
		boolean flag=true;
		for(int i =0;i<str.length;i++){
			flag=true;
		for(int j=i+1;j<str.length;j++){
//			if(str[i].equals(str[j])){
				if(str[i]==str[j]){
				flag=false;
			break;
				}
		}
		if(flag==true)
			str2[i]=str[i];
		}

		for(int m=0;m<str2.length;m++){
			if(str2[m]!=null){
		System.out.println(str2[m]);
			}
			}
		return str2;
	}
}
