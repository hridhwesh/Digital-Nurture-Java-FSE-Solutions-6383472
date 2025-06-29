package com.example.junit_basics;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class StringTest {
	private StringConcatenator sc;
	
	@Before
	public void setUp() {
		//Arrange
		System.out.println("Setting up String Concatenator..");
		sc = new StringConcatenator();
	}
	
	@After
	public void tearDown() {
		System.out.println("Cleaning up..");
		sc = null;
	}
	
	@Test
	public void testConcatenator1() {
		//Act
		String result = sc.concatedString("Hello ","World!");
		
		//Assert
		assertEquals("Hello World!", result);
	}
	@Test
	public void testConcatenator2() {
		//Act
		String result = sc.concatedString("","Hello");
		
		//Assert
		assertEquals("Hello", result);
	}
}
