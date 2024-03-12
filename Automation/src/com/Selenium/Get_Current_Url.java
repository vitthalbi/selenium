package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Current_Url {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		//To fetch the source code particular web Application 
		String source = driver.getPageSource();
		System.out.println(source);
		
		
	
		//To fetch the current Url of Current Web page
		String actualUrl=driver.getCurrentUrl();
		String expectedUrl="https://paytm.com/";
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("URL is Pass");
		}
		else
		{
			System.out.println("Title is Pass");
		}
		
		
		
		// use to fetch the current title of current web page
		String actual_title=driver.getTitle();
		String expected_title="Paytm: Secure & Fast UPI Payments, Recharge Mobile & Pay Bills";
	    if(actual_title.equals(expected_title))	
	    {
	    	System.out.println("TestCase is Pass");
	    }
	    else
	    {
	    	System.out.println("TestCase is Fail");
	    }
	    
	    
	    //use to close the parent browser
	    driver.close();
	    
	    //used to close the parent as well as child window
	    driver.quit();
	}

}
