package SearchContext;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class pppppppppp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver( );
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.elementToBeClickable(f));
//		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement Gender=driver.findElement(By.id("select2"));
		
		Select s= new Select(Gender);
		//s.selectByValue("female");
		s.selectByIndex(1);
		 Thread.sleep(10);
s.deselectByIndex(1);
		
	}

}



