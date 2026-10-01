package com.java.selenium.base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;



public class Base {

	public static WebDriver driver;
	public static ExtentReports extentReports;
	public static ExtentTest extentTest;
	
	public static String startDate;
	public static String reportsDestination;
	public String reportFilePath;
	
	@BeforeSuite
	public void beforeAll(ITestContext itc) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("MMM_dd_yyyy_z_HH_mm_ss");
		startDate = sdf.format(new Date());
		reportFilePath = System.getProperty("user.dir")+File.separator+"Reports"+File.separator+"reports_"+startDate+".html";
		extentReports = new ExtentReports(reportFilePath);
	}
	
	
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
		extentReports.flush();
	}
}
