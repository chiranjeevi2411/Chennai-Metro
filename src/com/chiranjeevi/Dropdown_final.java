package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_final {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement search = driver.findElement(By.id("searchDropdownBox"));
		Select se = new Select(search);
		Thread.sleep(1000);
		se.selectByIndex(8);
		Thread.sleep(1000);
		se.selectByValue("search-alias=automotive");
		Thread.sleep(2000);
		se.selectByVisibleText("Apps & Games");
		Thread.sleep(2000);
		driver.quit();
		}
}
