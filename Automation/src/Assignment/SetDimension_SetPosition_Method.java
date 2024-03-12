package Assignment;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetDimension_SetPosition_Method {

	public static void main(String[] args) {
		//to launch the browser 
		WebDriver driver= new ChromeDriver();
		// to launch the web application
		driver.get("https://www.google.com/");
		 
		//to set the dimension
		Dimension dimension =new Dimension(1000, 200);
		System.out.println(dimension);
		driver.manage().window().setSize(dimension);

		//to set the position
		Point position = new Point(500, 250);
		System.out.println(position);
		driver.manage().window().setPosition(position);


	}

}
