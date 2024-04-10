package JavaScriptExecutor;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class saucedemo_assingment {

	public static void main(String[] args) {
		// creating an object of specific class
		WebDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the web application
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.id("user-name")).sendKeys("standard_user",Keys.ENTER);
		driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		
		
		List<WebElement> Name = driver.findElements(By.xpath("//div[text()='Sauce Labs Backpack']"));
		List<WebElement> Price = driver.findElements(By.xpath("//div[@class='inventory_details_price']"));
		
		for (WebElement name:Name)
		{
			for(WebElement price:Price) 
			{
			    System.out.println(name.getText()+"============="+price.getText());

			}
		
		
	}

	}
	}
