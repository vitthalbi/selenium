package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Right_ScrollBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Launch the browser
				WebDriver driver= new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				//use implicit wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				// Launch the web application
				driver.get("https://dashboards.handmadeinteractive.com/jasonlove/");
				//here we are doing explicit type casting
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("window.scroll(0,3000);");
				Thread.sleep(2000);
				js.executeScript("window.scroll(-1000,0);");
			

	}

}
