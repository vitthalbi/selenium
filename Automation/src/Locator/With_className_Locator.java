package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class With_className_Locator {

	public static void main(String[] args) {
		
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");
WebElement element = driver.findElement(By.className("Pke_EE"));
element.sendKeys("samsung");

	}

}
