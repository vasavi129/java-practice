package corejava;

public class primeNum {
	public static void main(String[] args) {
		int i;
		int count = 1;
		int num =0;
		int input=10;
		int sum = 0;
		int n = 1000;
		for (i = 2; i < n; i++) {
			count = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 0&&num<input) 
			        {
				      System.out.println(i);
				      num++;
				sum = sum + i;
			        }
		}
		System.out.println("sum is" + " " + sum);
	}
}
