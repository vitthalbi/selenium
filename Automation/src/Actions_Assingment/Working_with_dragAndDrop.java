package Actions_Assingment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Working_with_dragAndDrop {

	public static void main(String[] args) {
		        //Launch the browser
				WebDriver driver= new ChromeDriver();
			
				//maximize the browser
				driver.manage().window().maximize();
				
				//use implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Launch the web application
				driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
				
				// identify particular web element of drag
				WebElement drag = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
				
				// identify particular web element of drop
				WebElement drop = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
				
				//create an object of Actions class
				Actions act=new Actions(driver);
				
				//use dragAndDrop method
				act.dragAndDrop(drag, drop).perform();
				
				// identify particular web element of drag
				WebElement drag1 = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
				
				// identify particular web element of drop
				WebElement drop1 = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
				
				//create an object of Actions class
				Actions act1=new Actions(driver);
				
				//use dragAndDrop method
				act1.dragAndDrop(drag1, drop1).perform();

	}

}
