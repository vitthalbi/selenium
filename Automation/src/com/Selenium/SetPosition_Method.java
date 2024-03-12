package com.Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition_Method {

	public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	Point position=new Point(500, 250);
	System.out.println(position);
	driver.manage().window().setPosition(position);
	driver.get("https://www.google.com/");

	}

}
