
public class BubbleSort {
	
	
	
	public int[] bubbleSort(int arr[]) throws Exception{
		int a = arr.length;
		System.out.println(a);
		if(arr.length>0){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr);
		}
		}else{
		throw new Exception("there are no elements");
		}
		return arr;
		
	}
	
	public static void main(String[] args) throws Exception {
		BubbleSort b=new BubbleSort();
		int[] arr={45,2,56,8,89};
		b.bubbleSort(arr);
	}
}
