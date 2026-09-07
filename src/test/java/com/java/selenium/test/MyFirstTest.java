package com.java.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTest {
	
	@Test
	public void testCase1() {

        // 1. Initialize the Chrome WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Maximize the browser window
            driver.manage().window().maximize();

            // 3. Set an Implicit Wait to give elements time to load
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            // 4. Navigate to the target website
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // 5. Fetch and print the web page title
            String title = driver.getTitle();
            System.out.println("Web Page Title: " + title);
            Thread.sleep(5000);
            // 6. Find a text input element using its 'name' attribute and type text into it
            WebElement textBox = driver.findElement(By.cssSelector("input[id='my-text-id']"));
            textBox.sendKeys("Selenium Java Automation By Wondimu!!");
            
            WebElement textAarea = driver.findElement(By.tagName("textarea"));
            textAarea.sendKeys("Ttype Ttype asdtwjjk sdsmfsf sfgsg,gfdgdg dgdfgdfgfd");
            Thread.sleep(5000);

            WebElement checkBox = driver.findElement(By.name("my-check"));
            checkBox.click();
            Thread.sleep(2000);
            
            WebElement dropDdown = driver.findElement(By.cssSelector("select[name*='my']"));
            dropDdown.click();
            Thread.sleep(5000);
            //By.className("my-text-id");
            //WebElement returnTtoIindex = driver.findElement(By.linkText("Return to index"));
            WebElement returnTtoIindex = driver.findElement(By.partialLinkText("to index"));
            returnTtoIindex.click();
             ;
           
            Thread.sleep(5000);
            // 7. Find the submit button using a CSS Selector and click it
           // WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
//            submitButton.click();

            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 9. Close all browser windows and safely terminate the WebDriver session
            driver.quit();
        }
 
	}

	@Test
	public void testCase2() {

        // 1. Initialize the Chrome WebDriver instance
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Maximize the browser window
            driver.manage().window().maximize();

            // 3. Set an Implicit Wait to give elements time to load
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

            // 4. Navigate to the target website
            driver.get("https://www.selenium.dev/selenium/web/web-form.html");

            // 5. Fetch and print the web page title
            String title = driver.getTitle();
            System.out.println("Web Page Title: " + title);
            Thread.sleep(5000);
            // 6. Find a text input element using its 'name' attribute and type text into it
            WebElement textBox = driver.findElement(By.cssSelector("input[id='my-text-id']"));
            textBox.sendKeys("Selenium Java Automation By Wondimu!!");
            
            WebElement textAarea = driver.findElement(By.tagName("textarea"));
            textAarea.sendKeys("Ttype Ttype asdtwjjk sdsmfsf sfgsg,gfdgdg dgdfgdfgfd");
            Thread.sleep(5000);

            WebElement checkBox = driver.findElement(By.name("my-check"));
            checkBox.click();
            Thread.sleep(2000);
            
            WebElement dropDdown = driver.findElement(By.cssSelector("select[name*='my']"));
            dropDdown.click();
            Thread.sleep(5000);
            //By.className("my-text-id");
            //WebElement returnTtoIindex = driver.findElement(By.linkText("Return to index"));
            WebElement returnTtoIindex = driver.findElement(By.partialLinkText("to index"));
            returnTtoIindex.click();
             ;
           
            Thread.sleep(5000);
            // 7. Find the submit button using a CSS Selector and click it
           // WebElement submitButton = driver.findElement(By.xpath("//button[text()='Submit']"));
//            submitButton.click();

            Thread.sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 9. Close all browser windows and safely terminate the WebDriver session
            driver.quit();
        }
 
	}

	
}
