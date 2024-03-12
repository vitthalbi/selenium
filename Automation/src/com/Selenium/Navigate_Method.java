package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	
	 driver.navigate().to("https://www.zomato.com/");
	 Thread.sleep(2000);
	 
	 driver.navigate().back();
	 Thread.sleep(2000);
	 
	 driver.navigate().forward();
	 Thread.sleep(2000);
	 
	 driver.navigate().refresh();
	 Thread.sleep(2000);
	 

	}

}
