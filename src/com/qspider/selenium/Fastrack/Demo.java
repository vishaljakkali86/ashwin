package com.qspider.selenium.Fastrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.gecko.driver","A:/selenium/geckodriver-v0.11.1-win32/geckodriver.exe" );
	WebDriver driver = new FirefoxDriver();
	driver.get("file:///C:/Users/Sony/Desktop/test.html");
	driver.navigate().back();
//	driver.findElement(By.id("a1")).click();
//	driver.findElement(By.className("c1")).click();
//	driver.findElement(By.name("n1")).click();
//	driver.findElement(By.tagName("a")).click();
	driver.findElement(By.cssSelector("a[text()='cbt']")).click();
	Thread.sleep(4000);
	driver.quit();
	
}
	
}


