package Actions_Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_With_clickAndHold {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
		WebDriver driver= new ChromeDriver();
	
		//maximize the browser
		driver.manage().window().maximize();
		
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch the web application
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		// identify particular web element
		WebElement clickandhold = driver.findElement(By.id("circle"));
		
		//create an object of Actions class
		Actions act=new Actions(driver);
		
		// use clickAndHold method
		act.clickAndHold(clickandhold).perform();
		Thread.sleep(2000);
		// we can use both method 
		act.click().perform();
	
		act.release().perform();
		
	}

}
