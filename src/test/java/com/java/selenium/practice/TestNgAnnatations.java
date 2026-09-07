package com.java.selenium.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNgAnnatations extends TestNgAnnatationsPparent{
	/**
	 * test
	 * test
	 * test
	 */
	
	@BeforeClass
	public void testBeforeClass() {
		System.out.println("Before Class");
	}

	@AfterClass
	public void testAfterClass() {
		System.out.println("After Class");
	}

	@Test
	public void testTest() {
		System.out.println("Test");
	}
	
	
}
