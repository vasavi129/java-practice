package corejava;

public class BubbleSort {

public static void main(String[] args) {
	

	int arr[] = {1,2,7,5,4,6,9,34,78,45};
	int n= arr.length-1;
	boolean flag= true;
  for(int i=0;i<n;i++){
	  for(int j=0;j<=i;j++){
		 flag = false;
		  if(arr[j]>arr[j+1]){
			  int temp=arr[j];
			  arr[j]=arr[j+1];
			  arr[j+1]=temp;
			  flag=true;
		  }
		  
	  }
  }
  
 


for(int k=0;k<=n;k++){
	  System.out.println(arr[k]);
}}}

