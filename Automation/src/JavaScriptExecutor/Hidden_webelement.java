package JavaScriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_webelement {

	public static void main(String[] args) {
		// creating an object of specific class
				ChromeDriver driver=new ChromeDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//use implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//Launch the web application
				driver.get("https://www.facebook.com/signup/");
				
				WebElement optional = driver.findElement(By.name("custom_gender"));
				JavascriptExecutor js= (JavascriptExecutor)driver;
				js.executeScript("arguments[0].value='transgendar'", optional);

	}

}
