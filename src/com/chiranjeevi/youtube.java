package com.chiranjeevi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) throws IOException,Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\g.png");
		FileUtils.copyFile(src, des);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		TakesScreenshot t1=(TakesScreenshot)driver;
		File t2 = t1.getScreenshotAs(OutputType.FILE);
		File des1 = new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\g1.png");
		FileUtils.copyFile(t2, des1);
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("moto");
		driver.quit();

	}

}
