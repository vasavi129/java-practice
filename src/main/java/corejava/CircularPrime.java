package corejava;

public class CircularPrime {
	static int nod = 0;
	static int count;
	private static int count1;
	private static int nod2;
	private static int j;

	public static int countDigits(int n) {
		while (n > 0) {
			nod++;
			int a = n / 10;
		}
		System.out.println("1");
		return nod;
	}
	public static int countValue(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		System.out.println("2");
		return count;
	}
	public static Boolean isPrime(int n) {
		int count = countValue(n);

		if (count == 2) {
			return true;
		}
		System.out.println("3");
		return false;
	}
	public static int counter(int a, int b) {
		int nod1 = a;
		int num = b;
		while (nod1 >= j) {
			int rem = num % 10;
			int div = num / 10;
			num = (int) (Math.pow(10, (nod1 - 1)) * rem) + div;
			for (int k = 2; k < num; k++) {
				if (num % k == 0) {
					count1++;
				}
				if (count1 == 0) {
					nod2++;
				}
				j++;
			}
		}
		System.out.println("4");
		return nod2;
	}
	public static Boolean isCircularPrime(int n) {
		int nod = countDigits(n);
		int nod2= counter(nod, n);
		if (nod == nod2) {
			System.out.println("5");
			return true;
		}
		return false;
	}
public static void main(String[] args) {
	int count = countDigits(4);
	int count1 = countValue(1193);
	Boolean prime = isPrime(1193);
	int counter = counter(count, 1193);
	Boolean Circularprime = isCircularPrime(1193);
	System.out.println( "numer is Curcular Prime" +Circularprime );
}
}
