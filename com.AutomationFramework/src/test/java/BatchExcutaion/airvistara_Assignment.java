package BatchExcutaion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class airvistara_Assignment {
@Test
	public void Air() {
		WebDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//use implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//launch the web application
		driver.get("https://www.airvistara.com/");
		
		//fetch the current title on particular web page
		String Acutal_Title=driver.getTitle();
		String Expected_Title="Book Flights & Check In Online | Vistara";
		if(Acutal_Title.equals(Expected_Title))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is wrong");
		}
	}

}
