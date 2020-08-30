package corejava;

import java.util.Arrays;

class ddd{
	
public static void main(String[] args)
{
int arr[] = new int[]{1,2,3,1,2,5};
int arr1[]= new int[]{2,8,5,6,5,5};
int len=arr.length+arr1.length;
int arr2[] = new int[len];
int j=0;
for(int i =0;i<arr.length;i++){
	arr2[j]=arr[i];
	j++;
}
for(int m=0;m<arr1.length;m++){
	arr2[j]=arr1[m];
	j++;
}
int count =0;
boolean flag = true;
for(int n=0;n<len;n++){
	flag = true;
	for(int k=n+1;k<len;k++){
		if(arr2[n]==arr2[k]){
			flag = false;
			break;
			}
		
	}if(flag==true){
		count++;}
	
}
System.out.println(Arrays.toString(arr2));
System.out.println(count);
}
}