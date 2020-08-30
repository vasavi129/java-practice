
package corejava;

public class FindSmallest {

	//static String name = "hello Junit";
	/*int a;
	int b;
	int c;*/

	int findSmallest(int arr[]) {

		int temp;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		int small = arr[0];
		/*
		 * int a = arr[0]; int b = arr[1]; int c = arr[2]; if (a > b && b < c) {
		 * small = b; } if (b > c && c < a) {
		 * 
		 * // small = c; } else small = a; // System.out.println(small);
		 */ return small;
	}

	public static void main(String[] args) {

		/*
		 * int a=99 ; int b = 56; int c = 7; int small; if(a>b&&b<c){ small = b;
		 * } if(b>c&&c<a){
		 * 
		 * small= c; } else small=a; System.out.println(small); }
		 */
		int aray[] = { 44, 88, 3, 45, 22, 56 };
		// 0 1 2 3 4 5
		FindSmallest smallest = new FindSmallest();
		int small = smallest.findSmallest(aray);
		System.out.println(small);
		/*
		 * FindSmallest findSmallest = new FindSmallest();
		 * 
		 * int smallnum = findSmallest.findSmallest();
		 * System.out.println(smallnum);
		 */

	}
}