package corejava;

public class findSmallestNumber {

	private int small;

	public int findSmallest(int a[]){
		int temp = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]>a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

					
				}

				

			}



			 small=a[0];

			

		}
		return small;



	}
	
	public static void main(String[] args) {
		
		findSmallestNumber findSmallestNumber = new findSmallestNumber();
		
		
		int a[]={45,5,68,75,25,6};
		int smallnum = findSmallestNumber.findSmallest(a);
		System.out.println(smallnum);
		
		
	}
}