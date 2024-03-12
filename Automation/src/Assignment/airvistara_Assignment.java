package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class airvistara_Assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.airvistara.com/");
		
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
