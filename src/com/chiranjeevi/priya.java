package com.chiranjeevi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class priya {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","c:\\Users\\DURAI\\eclipse-workspace\\Poori\\chumma\\chromedriver.exe");
       
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       WebElement all = driver.findElement(By.id("searchDropdownBox"));
      Thread.sleep(3000);
      Select s=new Select(all);
      s.selectByValue("search-alias=electronics");
      s.selectByIndex(4);
      s.selectByVisibleText("Luggage & Bags");
      driver.quit();
      
      
       
       
       
       
       
       

	}

}
