import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

	@Test
	public void testbubbleSortPositive() throws Exception {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr={45,2,56,8,89};
		int[] expected={2,8,45,56,89};
		int[] result = bubbleSort.bubbleSort(arr);
		Assert.assertArrayEquals(expected, result);
	}
	
	@Test(expected = Exception.class)
	public void testbubbleSortFailure() throws Exception {
		BubbleSort bubbleSort = new BubbleSort();
		int[] arr={};
		int[] result = bubbleSort.bubbleSort(arr);
		//Assert.assertArrayEquals(expected, result);
	}

}
