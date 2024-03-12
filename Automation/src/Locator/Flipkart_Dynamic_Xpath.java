package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Dynamic_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//launch the web application
		driver.get("http://www.flipkart.com/");

		//search iphonne14
		WebElement s = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		s.sendKeys("iphonne 14");

		driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
		//display iphonne14 price		
		WebElement element = driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Starlight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		String text = element.getText();
		System.out.println(text);
	

}
}