package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insatagram_With_Locators {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		
        WebElement signupbutton = driver.findElement(By.className("_aaco"));
        signupbutton.click();
		
        
		WebElement mobileoremail= driver.findElement(By.name("emailOrPhone"));
		mobileoremail.sendKeys("abc@gmail.com");
		
		WebElement fullname= driver.findElement(By.name("fullName"));
		fullname.sendKeys("viki patil");
		
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("viki patil");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("viki@123");
		
	
		WebElement loginButton = driver.findElement(By.partialLinkText("Sign"));
		loginButton.click();
	}

	}


