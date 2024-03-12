package Locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Airvistra_FlightBook_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		// use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.airvistara.com/in/en");
		//cancel 1st pop-up
		driver.findElement(By.xpath("//button[@id=\"cookieModalCloseBtn\"]")).click();
		//Origin point--------------->
		//send the city name and enter inside text-filed
		driver.findElement(By.xpath("//input[@placeholder=\"Select Departure City\"and@name=\"flightSearchFrom\"]")).sendKeys("PNQ",Keys.ENTER);
		//Destination point------------>
        //send the city name and enter inside text-filed
		driver.findElement(By.xpath("//input[@name=\"flightSearchTo\"]")).sendKeys("kolkata",Keys.ENTER);
		//select month-section
		driver.findElement(By.xpath("//input[@id=\"departCalendar\"]")).click();

		driver.findElement(By.xpath("//div[@style=\"pointer-events: auto;\"]/ancestor::div[@class=\"col-xs-12 col-sm-12 col-md-4 padd-0\"]")).click();
	
	driver.findElement(By.xpath("//td[@class=\" ui-datepicker-week-end  everymundo\"]/ancestor::table[@class=\"ui-datepicker-calendar\"]")).click();
	
	driver.findElement(By.xpath("//td[@data-handler=\"selectDay\"]/ancestor::table[@class=\"ui-datepicker-calendar\"]")).click();
	
	//Search Flight
	driver.findElement(By.xpath("//button[@class=\"widget-btn aubergine-button-dark search_book_flights\"]")).click();
	
	
	
	
	
	
	
	
	
	}

}
