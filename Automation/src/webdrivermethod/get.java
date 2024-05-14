package webdrivermethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login.php/");
		String pageSource = driver.getTitle();
		String p=driver.getCurrentUrl();
		String pa= driver.getPageSource();
		System.out.println(pa);
		System.out.println(pageSource);
		System.out.println(p);
		Thread.sleep(10);
		
		driver.close();
		Thread.sleep(10);

		driver.quit();
	}

}
