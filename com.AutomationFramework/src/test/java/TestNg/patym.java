package TestNg;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class patym {

	public static void main(String[] args) {

		//Launch the browser 
		WebDriver driver = new ChromeDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	//Launch the web application
	driver.get("https://paytm.com/");
   // driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']/ancestor::div[@class='_3noxt']")).click();
	
	//click on Flight
    driver.findElement(By.xpath("//img[@src='https://assetscdn1.paytm.com/images/catalog/view_item/733296/1626259884425.png']")).click();
	
	
	
	//FROM------>
  
	//click on OneWay
	driver.findElement(By.xpath("//label[@class='z99kO']")).click();
	
	
	//click on Delhi text box
	driver.findElement(By.xpath("//span[@class='_1Oyg-']")).click();
	
	
	//click on cross button 
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	driver.findElement(By.xpath("//input[@class='_1X2Sn']/ancestor::div[@class='_27rS9']")).click();
	
	//pass the value
	WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
	element.sendKeys("Pune, Maharashtra, India");
	
	
	//click on value
	driver.findElement(By.xpath("//div[contains(text(),'Pune, Maharashtra, India')]")).click();
	
	
	//TO----->
	
	//Click on mumbai text box
	driver.findElement(By.xpath("//span[@id='destCity']")).click();
	
	//click on cross button
	driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
	
	driver.findElement(By.xpath("//input[@class='_1X2Sn']/ancestor::div[@class='_27rS9']")).click();
	
	//pass the value
	driver.findElement(By.xpath("//div[contains(text(),'Bengaluru, Karnataka, India')]")).click();
	
		// DATE
	 // Select current departure date
    LocalDate currentDate = LocalDate.now();
    int departureDate = currentDate.getDayOfMonth();
    
    
    driver.findElement(By.xpath("//div[text()='30']"))
    .click();

	}

}
