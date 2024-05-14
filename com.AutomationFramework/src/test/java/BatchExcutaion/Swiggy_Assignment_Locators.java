package BatchExcutaion;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swiggy_Assignment_Locators {
   @Test
	public  void Swiggy() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.swiggy.com/auth");
	WebElement element = driver.findElement(By.id("mobile"));
	element.sendKeys("7758889730");
	
	WebElement element1 = driver.findElement(By.className("a-ayg"));
	element1.click();

	}

}
