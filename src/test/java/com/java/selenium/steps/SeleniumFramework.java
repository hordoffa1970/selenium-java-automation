


package com.java.selenium.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFramework {
	
	public static void main(String[]args) {

	
	//1. initialize the ChromewebDriver instance or create a webDriver with ChromeDriver object.	
	//2. Launch the browser
	WebDriver driver = new ChromeDriver();
	
	//2. open a web site 
	driver.get("https://www.google.com");
	//Navigate to a specific URL
	//driver.navigate().to("http://bing.com");
	
	//3. Maximize the browser window or set to fullScreen.
	driver.manage().window().minimize();
	
	
	//print page title
	System.out.println("Title: " + driver.getTitle());
	
	driver.quit();
	
}

}
  
 