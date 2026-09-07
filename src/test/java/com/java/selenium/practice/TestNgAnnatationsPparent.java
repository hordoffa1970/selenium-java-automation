package com.java.selenium.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestNgAnnatationsPparent {

	@BeforeSuite
	public void testBeforeSuite() {
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void testBeforeMethod() {
		System.out.println("BeforeMethod");
	}
	
	@AfterSuite
	public void testAfterSuite() {
		System.out.println("After Suite");
	}
	
	@AfterMethod
	public void testAfterMethod() {
		System.out.println("After Method");
	}
	
}
