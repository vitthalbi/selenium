package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	
public static void main(String[] args) {
	
WebDriver driver =new ChromeDriver();

driver.get("https://www.flipkart.com/");

String actaul_title=driver.getTitle();

String expected_title="Vistara Direct - Book Flight Tickets and Enjoy Exclusive Benefits";


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
