package com.collections;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MockitoMockAnnotationExample {

	@Mock
	List<String> mockList;
	
	@Before
	public void setup() {
		//if we don't call below, we will get NullPointerException
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void test() {
		Mockito.when(mockList.get(0)).thenReturn("My Response");
		System.out.println(mockList.get(0));
		assertEquals("My Response", mockList.get(0));
	}
	
}