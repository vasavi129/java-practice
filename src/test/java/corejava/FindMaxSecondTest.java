package corejava;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FindMaxSecondTest {
	String name = "aa";
	 FindMaxSecond s = null;
  @Before
	public void beforemethod(){
	  s= new FindMaxSecond();
	  name = "aa";
		
  }
  @After
  public void aaa(){
	  
  }
	@Test
	public void testPrintTwoMaxNumbersPositive() throws CustomException {
		 int num[] = {};
		int actual=s.printTwoMaxNumbers(num);
		System.out.println("actual "+actual);
		int expected = 0;
		name = "bb";
		assertEquals("checking max two number",expected,actual);
	}
	@Test(expected = CustomException.class)
	public void Test1() throws CustomException{
		int nums[] = {};
		System.out.println(nums.length);
	int a=	s.printTwoMaxNumbers(nums);
	System.out.println(a);
	}
}
