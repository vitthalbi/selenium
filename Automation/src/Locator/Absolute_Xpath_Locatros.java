package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath_Locatros {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();
		/*driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div[2]/input")).sendKeys("biradarvitthal001@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]/input")).sendKeys("Vitthal@123");
		
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[4]/input[1]")).click();

	driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();*/
	
//driver.findElement(By.xpath("//li[@id='topcartlink']")).click();
	
		//driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
	}

}
