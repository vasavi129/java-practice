/*package corejava;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
@RunWith(PowerMockRunner.class)//1 step - run with powerMock
@PrepareForTest(MocktoExample.class)//2 declare injected class
public class MocktoExampleTest {
	@Mock
	FindSmallest smallest ;
	@InjectMocks
	MocktoExample mocktoExample ;
	//FindSmallest findsmallestMock = null;
	@Before
	public void setup() throws Exception{
		MockitoAnnotations.initMocks(this);
		//whenNew(FindSmallest.class).withArguments(anyString(), anyString()).thenReturn(lcMock);
		 //findsmallestMock = Mockito.mock(FindSmallest.class);
		//mock new keyword
		//3
		PowerMockito.whenNew(FindSmallest.class).withNoArguments().thenReturn(smallest);
		//4
		Mockito.when(smallest.findSmallest()).thenReturn(12);
	}
	
	//Mockito.mock(FindSmallest.class);
	
	@Test
	public void testGetsmallValue() {
		
		
		//MocktoExample mocktoExample = new MocktoExample();
		int smallValue = mocktoExample.getsmallValue();
		System.out.println(smallValue);
	}

}
*/