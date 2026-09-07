package com.java.selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.java.selenium.base.Base;

public class ActionEngine extends Base {

	public void click(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
	}

	public void type(By locator, String message) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(message);
	}
}
