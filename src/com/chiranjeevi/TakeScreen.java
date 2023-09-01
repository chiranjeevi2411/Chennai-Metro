package com.chiranjeevi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreen {
	
	static WebDriver driver;
	
	
	public static void property()  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe" );
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void url() {
		
		driver.get("https://www.flipkart.com/");
		}
	public static void scmethod() throws Exception {
		
		TakesScreenshot a= (TakesScreenshot) driver;
		File src = a.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\g.png");
		FileUtils.copyFile(src, des);
	}
	
	public static void closing() {
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	public static void tss() throws Exception {
		
		TakesScreenshot b = (TakesScreenshot) driver;
		File src = b.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\g1.png");
	    FileUtils.copyFile(src, des);
		
		
	}
	
	public static void main(String[] args) throws Exception {
		property();
		url();
		scmethod();
		closing();
		tss();
		driver.quit();
	}
}
