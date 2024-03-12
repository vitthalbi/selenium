package SearchContext;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_ipad {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");

	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
	List<WebElement> Name = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> Price = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	
	for (WebElement name:Name)
	{
		for(WebElement price:Price) 
		{
		    System.out.println(name.getText()+"============="+price.getText());

		}
		
		break;
		
	}
	
	
	
	
	
	}

}
