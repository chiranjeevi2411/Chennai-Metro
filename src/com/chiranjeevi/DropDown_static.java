package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_static {

	static WebDriver driver;

	public static void starting() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe");
	}

	public static void url() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.id("searchDropdownBox"));
		
		
		Select sc = new Select(search);
		sc.selectByIndex(4);
		Thread.sleep(2000);
		sc.selectByVisibleText("Baby");
		Thread.sleep(2000);
		sc.selectByValue("search-alias=mobile-apps");
		driver.quit()
;
		}
	

	

	public static void main(String[] args) throws Exception {
		starting();
		url();
	
		
		
		
		

	}

}
