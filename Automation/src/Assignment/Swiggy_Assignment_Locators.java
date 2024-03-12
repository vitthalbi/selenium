package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy_Assignment_Locators {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/auth");
	WebElement element = driver.findElement(By.id("mobile"));
	element.sendKeys("7758889730");
	
	WebElement element1 = driver.findElement(By.className("a-ayg"));
	element1.click();

	}

}
