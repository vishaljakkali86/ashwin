package com.qspider.selenium.Fastrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","A:/selenium/geckodriver-v0.11.1-win32/geckodriver.exe" );
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Sony/Desktop/practice.html");
		driver.findElement(By.id("username")).sendKeys("Vishal");
		driver.findElement(By.id("password")).sendKeys("pwd");
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(4000);
		driver.quit();

	}

}
