package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize_method {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dimension= new Dimension(1000, 2000);
		System.out.println(dimension);
		driver.manage().window().setSize(dimension);
		
	}

}
