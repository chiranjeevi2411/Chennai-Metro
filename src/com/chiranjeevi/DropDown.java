package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        WebElement click = driver.findElement(By.id("searchDropdownBox"));
        Thread.sleep(3000);
        Select f= new Select(click);
        f.selectByValue("search-alias=furniture");
        Thread.sleep(3000);
        f.selectByVisibleText("Health & Personal Care");
        f.selectByIndex(24);
        Thread.sleep(3000);
        driver.close();
        
        
        
	}

}
