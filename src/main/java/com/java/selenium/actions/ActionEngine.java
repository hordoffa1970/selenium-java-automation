package com.java.selenium.actions;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.java.selenium.base.Base;
import com.relevantcodes.extentreports.LogStatus;

public class ActionEngine extends Base {


	
	public void click(By locator, String locatorName) throws Throwable{
		boolean flag =false;
		try {
		driver.findElement(locator).click();
		flag = true;
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			if(flag) {
				extentTest.log(LogStatus.PASS, "Succfully clicked on locator "+locatorName);
			}else {
				extentTest.log(LogStatus.FAIL, "Failed to click on locator "+locatorName + extentTest.addScreenCapture(getScreenshot(locatorName)));
			}
		}
	}
	
		public void type(By locator, String data, String locatorName) throws Throwable{
			boolean flag =false;
			try {
				driver.findElement(locator).sendKeys(Keys.CLEAR);
				driver.findElement(locator).sendKeys(data);
				flag = true;
			}catch(Exception e) {
				e.printStackTrace();
			}finally{
				if(flag) {
					extentTest.log(LogStatus.PASS, "Succfully entered given text into "+locatorName);
				}else {
					extentTest.log(LogStatus.FAIL, "Failed to entered given text into "+locatorName+ extentTest.addScreenCapture(getScreenshot(locatorName)));
				}
			}
		}
	
		public static String getScreenshot(String screenshotName) throws Throwable {
			String screenshotLocation = System.getProperty("user.dir");
			try {
				String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				screenshotLocation= screenshotLocation+File.separator+ "FailedScreenShots"+File.separator + screenshotName+ dateName + ".png";
				File finalDestination = new File(screenshotLocation);
				
				TakesScreenshot ts =(TakesScreenshot)driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, finalDestination);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			return screenshotLocation;
		}
}
