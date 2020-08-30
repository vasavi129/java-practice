package corejava;

public class FindMaxSecond {

	public int printTwoMaxNumbers(int[] nums) throws CustomException {
		int maxOne = 0;
		int maxTwo = 0;
		if (nums.length > 0) {

			for (int n : nums) {
				if (maxOne < n) { // 0<5,5<34,34<78
					maxTwo = maxOne; // 0,5,34
					maxOne = n;// 5,34,78
				} else if (maxTwo < n) {
					maxTwo = n;
				}

				System.out.println("First Max Number: " + maxOne);
				System.out.println("Second Max Number: " + maxTwo);

			}
		}
		else{
			throw new CustomException("provide valid input");
		}
		return maxTwo;
	}

	public static void main(String[] args) throws CustomException {
		int num[] = { 5, 34, 78, 2, 45, 777, 99, 23 };
		FindMaxSecond n = new FindMaxSecond();
		int max = n.printTwoMaxNumbers(num);
		System.out.println(max);
	}
}