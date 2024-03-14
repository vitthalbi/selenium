package Actions_Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_moveToElement {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
	
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		//Launch the web application
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		
		// identify particular web element
		WebElement move = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));
		
		//create an object of Actions class
		Actions act= new Actions(driver);
		
		//use moveToElement method
    act.moveToElement(move).perform();
	
    
	
	
	
	}

}
