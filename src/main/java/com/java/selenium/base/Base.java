package com.java.selenium.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static WebDriver driver;
	
	@BeforeMethod
	public void setup() {
       // 1. Initialize the Chrome WebDriver instance
       driver = new ChromeDriver();
       // 2. Maximize the browser window
       driver.manage().window().maximize();

       // 3. Set an Implicit Wait to give elements time to load
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

       // 4. Navigate to the target website
       driver.get("https://www.selenium.dev/selenium/web/web-form.html");

       // 5. Fetch and print the web page title
       String title = driver.getTitle();
       System.out.println("Web Page Title: " + title);
       try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
