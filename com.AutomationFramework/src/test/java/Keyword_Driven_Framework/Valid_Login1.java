package Keyword_Driven_Framework;

import java.io.IOException;

import org.openqa.selenium.By;


public class Valid_Login1 extends base1 {
	public static void main(String[] args) throws IOException {
	

		base1 b = new base1();
	
		b.set();
		FLib1 lib = new FLib1();
		String username = lib.getDataFromProperty(prop_path, "username");
		System.out.println(username);
		String password = lib.getDataFromProperty(prop_path, "password");
		System.out.println(password);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		//click on user 
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		//click on Create New User
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		// fill login information
		driver.findElement(By.name("username")).sendKeys("sanket");
		driver.findElement(By.name("passwordText")).sendKeys("sanket123");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("sanket123");
		driver.findElement(By.name("firstName")).sendKeys("sankya");
		driver.findElement(By.name("lastName")).sendKeys("kale");
		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		

		//b.tearDown();
	
	}
}
