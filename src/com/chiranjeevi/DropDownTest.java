package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement click = driver.findElement(By.id("searchDropdownBox"));
		Thread.sleep(1000);
		Select sele = new Select(click);
		sele.selectByIndex(30);
		Thread.sleep(1000);
		sele.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(1000);
		sele.selectByVisibleText("Clothing & Accessories");

		Thread.sleep(1000);
		driver.quit();
	}

}
