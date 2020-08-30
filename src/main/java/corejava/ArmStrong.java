package corejava;

public class ArmStrong {
	@SuppressWarnings("unused")
	public static void main(String[] args) {

		int n = 153;
		int count = 0;
		int temp = n;
		int v = n;
		int r;
		int a, b;
		int sum = 0;
		while (n > 0) {
			System.out.println("in while");
			a = n % 10;// remider 3,5, 0
			count++;
			n = n / 10;// coefficient 15,1,0
		}
		while (temp > n) {
			b = temp % 10;  //remider 3,5, 0
			r = 1;
			for (int i = 1; i <= count; i++) {
				//System.out.println("adding number");
				r = r * b; //3*3*3 5*5*5
			}
			temp = temp / 10; //coefficient 15,1,0
			System.out.println(temp);
			sum = sum + r;
		}
		if (sum == v) {
			System.out.println("arm");
		} else
			System.out.println("not");
	}

}
