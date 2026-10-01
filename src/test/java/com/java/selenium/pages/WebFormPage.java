package com.java.selenium.pages;

import org.openqa.selenium.By;

import com.java.selenium.actions.ActionEngine;

public class WebFormPage extends ActionEngine {
	
	private By mytextId = By.cssSelector("input[id='my-text-id']");
	private By textArea = By.tagName("textarea");
	private By myCheck = By.name("my-check");
	private By selName = By.cssSelector("select[name*='my']");
	private By returToIndex = By.linkText("Return to index");
	private By toIndex = By.partialLinkText("to index");
	private By submit = By.xpath("//button[text()='Submit']");
	
	public void fillWebForm() throws Throwable {

		try {
			// 6. Find a text input element using its 'name' attribute and type text into it
			type(mytextId, "Selenium Java Automation By Wondimu!!", "My text id");
			type(textArea, "Ttype Ttype asdtwjjk sdsmfsf sfgsg,gfdgdg dgdfgdfgfd", "text area");
			Thread.sleep(5000);
			click(myCheck, "My check box");
			Thread.sleep(1000);
			Thread.sleep(1000);

			click(selName, "SelName");

			click(returToIndex, "My tutorial");
			click(toIndex, "My index");
			Thread.sleep(5000);
			// 7. Find the submit button using a CSS Selector and click it
			// WebElement submitButton =
			// driver.findElement(By.xpath("//button[text()='Submit']"));
//        submitButton.click();
			click(submit, "submit button");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 9. Close all browser windows and safely terminate the WebDriver session

		}
	}

}