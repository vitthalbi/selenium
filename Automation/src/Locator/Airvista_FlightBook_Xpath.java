package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airvista_FlightBook_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en");
		//cancel 1st pop-up
		driver.findElement(By.xpath("//button[@id=\"cookieModalCloseBtn\"]")).click();
		
		//click on oneway
		driver.findElement(By.xpath("//input[@id=\"onewaytrip\"]")).click();
		
		//origin
		driver.findElement(By.xpath("//input[@aria-label=\"Search origin\"]")).sendKeys("PNQ",Keys.ENTER);
		
		//Destination
		driver.findElement(By.xpath("//input[@aria-label=\"Search destination\"]")).sendKeys("DEL",Keys.ENTER);
		
		
		//click on month sections
		driver.findElement(By.xpath("//input[@class=\"form-control form-tabv4 widget-input departtxt date-grp valid wcag-form-field\"]")).click();
	
	   //click on particular month
		driver.findElement(By.xpath("//div[@monthname=\"Mar\"]")).click();
		
		//
		driver.findElement(By.xpath("//td[@data-event=\"click\"]/ancestor::table[@class=\"ui-datepicker-calendar\"]")).click();

		
		//click on Search Flight
		driver.findElement(By.xpath("//button[@id=\"book-flight-widget\"]")).click();
	
	
	}

}
