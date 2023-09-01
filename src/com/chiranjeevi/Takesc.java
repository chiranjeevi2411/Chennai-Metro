package com.chiranjeevi;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesc {

	public static void main(String[] args) throws IOException, InterruptedException {
		
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.flipkart.com/");
     TakesScreenshot sc = (TakesScreenshot)driver;
     File src = sc.getScreenshotAs(OutputType.FILE);
     FileHandler.copy(src,new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\f1.png"));
     
     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
     Thread.sleep(4000);
     TakesScreenshot sc1 = (TakesScreenshot)driver;
     sc1.getScreenshotAs(OutputType.FILE);
     FileHandler.copy(src,new File("C:\\Users\\DURAI\\eclipse-workspace\\Poori\\cap\\f12.png"));
     driver.quit();
     
	}

}
