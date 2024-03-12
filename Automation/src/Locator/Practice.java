package Locator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
        //maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the browser
		driver.get("https://www.flipkart.com/");
	//Search text filed
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone",Keys.ENTER);
		//Product name 
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		//Product price
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements1.get(i).getText()+"___________"+elements.get(i).getText());
			System.out.println("==============");
	    }
		
}
}