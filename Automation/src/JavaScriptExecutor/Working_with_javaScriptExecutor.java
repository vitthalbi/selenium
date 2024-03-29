package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_with_javaScriptExecutor {

	public static void main(String[] args) {
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// Launch the web application
		driver.get("https://www.netflix.com/in/");
		//here we are doing explicit type casting
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,3000);");
	}

}
