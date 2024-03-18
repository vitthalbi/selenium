package Locator;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime_Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://127.0.0.1/login.do;jsessionid=1o4x8u7u4bxem");
		//random class
        Random r= new Random();
        int no =r.nextInt(10000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
       driver.findElement(By.xpath("//a[@id='loginButton']")).click();
         driver.findElement(By.xpath("//a[@class='content users']")).click();
         driver.findElement(By.xpath("//input[@value='Create New User' and @type='button']")).click();
       driver.findElement(By.xpath("//input[@name='username' and@maxlength='32']")).sendKeys("Viki_Patil"+no);
 
      driver.findElement(By.xpath("//input[@type='password' and@name='passwordText']")).sendKeys("Vitthal@123"+no);
       driver.findElement(By.xpath("//input[@name='passwordTextRetype' and@style='width: 203px']")).sendKeys("Vitthal@123"+no);
	  driver.findElement(By.xpath("//input[@name='firstName' and@maxlength='32']")).sendKeys("Vishal"+no);
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Hudekar"+no);
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("654-987"+no);
	driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9876543210");
	driver.findElement(By.xpath("//input[@name='email' and@maxlength='255']")).sendKeys("vishalhudekar@gmail.com"+no);
	driver.findElement(By.xpath("//input[@value='   Create User   ' and@type='submit']")).click();
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
	//driver.findElement(By.xpath("//input[@value='Cancel the process']")).click();
	//driver.quit();
	
	}

}
