package com.java.selenium.practice;

import org.testng.annotations.Test;

import com.java.selenium.actions.ActionEngine;
import com.java.selenium.pages.WebFormPage;

public class PracticeAutoTesting extends ActionEngine {
	WebFormPage webFormPage = new WebFormPage();

	@Test
	public void testCase1() throws Throwable {
		try {
			webFormPage.fillWebForm();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
