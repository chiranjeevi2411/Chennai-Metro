package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css_selector {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.cssSelector("[id^='two']")).sendKeys("oppo");
		driver.findElement(By.cssSelector("[id$='box']")).sendKeys("oppo");
		//Thread.sleep(3000);
		//driver.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(3000);

		//driver.navigate().back();
	}
}
