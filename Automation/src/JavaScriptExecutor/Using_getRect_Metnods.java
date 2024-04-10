package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_getRect_Metnods {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Launch the web application
		driver.get("https://www.zomato.com/india");
		WebElement p=driver.findElement(By.xpath("//p[text()='Privacy']"));
		Rectangle rect = p.getRect();
	 int x= rect.getX();

	 int y= rect.getY();

	 JavascriptExecutor js=(JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy("+x+","+y+");");

	}

}
