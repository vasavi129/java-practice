import corejava.main;

public class EvenorOdd {
	
	public void evenmethod(int n){
		
	
if (n%2==0) {
	System.out.println("even num" + n);
}
else {
	System.out.println("odd num"+ n);
}
	
}
	
	public static void main(String[] args) {
		EvenorOdd evenorOdd=new EvenorOdd();
		//evenorOdd.evenmethod(2);
		
		//evenorOdd.checkPrimeNum(7);
		evenorOdd.findMinMax(88, 2, 1);
	}
	
	
	
	public void checkPrimeNum(int num){
		int count=0;
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				
				count++;
			}
			
		}
		if (count==2) {
			System.out.println("prime num  " + num);
		}else {
			System.out.println("not prime num  " + num);
		}
			
		}

	public void findMinMax(int n1, int n2, int n3) {
		int min = 0;
		int max = 0;
		if (n1 < n2) {
			min = n1;
			max = n2;
		} else {
			min = n2;
			max = n1;
		}
		if (max < n3) {
			max = n3;
		} else if (min > n3) {
			min = n3;
		}

		System.out.println("min " + min + "max " + max);
	}
}
		
		
	
	
	
	
	
	
	
