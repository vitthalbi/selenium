package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebApp_Assingment {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
		WebDriver driver = new ChromeDriver();
     
		// maximize the browser
		driver.manage().window().maximize();
	
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
		//launch the browser
		driver.get("https://demowebshop.tricentis.com/");
      
		//click on login link
		driver.findElement(By.className("ico-login")).click();
    
		//pass the E-mail Address
		driver.findElement(By.name("Email")).sendKeys("biradarvitthal001@gmail.com");
		
		//pass the password
		driver.findElement(By.name("Password")).sendKeys("Vitthal@123");
		
		//click on login button
		Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
      
	//click on books
		driver.findElement(By.xpath("//ul[@class='top-menu']/descendant::a[contains(text(),'Books')]")).click();
		
		// ADD to cart
		driver.findElement(By.xpath(
				"//a[@href='/computing-and-internet']/ancestor::div[@class='item-box']/descendant::input[@value='Add to cart']"))
				.click();
      
		//click on check box
		driver.findElement(By.xpath("//li[@id='topcartlink']/descendant::span[@class='cart-label']")).click();
		
		//click on 
		driver.findElement(By.name("removefromcart")).click();
		driver.findElement(By.xpath("//select[@class='country-input']")).click();
		driver.findElement(By.xpath("//option[@value='41']")).click();
		driver.findElement(By.xpath("//input[@name='termsofservice']")).click();
		
		//click on check out 
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		//click on continue billing address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='billing-buttons-container']//input[@title='Continue']")).click();
	
		//click on shipping address
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='shipping-buttons-container']//input[@title='Continue']")).click();
	
		//click on continue shipping method
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']//input[@value='Continue']")).click();
		
		//click on payment method
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/descendant::input[@class='button-1 payment-method-next-step-button']")).click();
	
		//click on payment confirmation
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/descendant::input[@class='button-1 payment-info-next-step-button']")).click();
		
		//click on confirm order
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='confirm-order-buttons-container']/descendant::input[@class='button-1 confirm-order-next-step-button']")).click();
	
	// click on continue button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click here for order details.']")).click();
		
		//click on PDF Invoice
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='PDF Invoice']")).click();
		
		//click on logout button
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
