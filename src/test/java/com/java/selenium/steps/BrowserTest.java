package com.java.selenium.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		//create Firefox browser instance
		
		WebDriver driver = new FirefoxDriver();
		//This starts Firefox and creates a Selenium WebDriver object that controls the browser.
		
		// open Selenium website
		driver.get("https://www.selenium.dev/");
		//Selenium navigates Firefox to the Selenium website.
		
		try {
		
		Thread.sleep(5000);
		//Because Thread.sleep() can throw InterruptedException, Java requires you to handle it with try/catch unless you declare throws InterruptedException.
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		//close the browser. This closes the browser and ends the WebDriver session.
		//driver.quit();

	}

}
  