package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_With_Get_Method {

	public static void main(String[] args) {
		 //To Launch The Browser
		WebDriver driver=new ChromeDriver();
		
		//To Launch The Web Application
		driver.get("https://www.airvistara.com/");
		
		//To Fetch The Current Title Of Current Web Page
		String actaul_title=driver.getTitle();
		
		
		String expected_title="Book Flights & Check In Online | Vistara";
		
		if(actaul_title.equals(expected_title))
		{
			System.out.println("TestCase is Pass");
		}
		else
		{
			System.out.println("TestCase is Fail");
			}


	}

}
