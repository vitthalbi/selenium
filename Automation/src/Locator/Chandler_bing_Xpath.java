package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chandler_bing_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
driver.findElement(By.xpath("//canvas[@class='lNPNe']")).click();

	}

}
