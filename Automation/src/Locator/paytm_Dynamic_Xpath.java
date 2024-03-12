package Locator;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm_Dynamic_Xpath {

	
		

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://tickets.paytm.com/flights/flightSearch/DEL-Delhi/BOM-Mumbai/1/0/0/E/2024-03-03");
			
			WebElement element = driver.findElement(By.xpath("(//span[text()='View Fare']/ancestor::div[@class=\"_1gMv6\"]/descendant::div[@class=\"_2MkSl\"])[1]"));

			String text = element.getText();
			System.out.println(text);
			List<WebElement> elements = driver.findElements(By.className("_1gMv6"));
			for(int i=0;i<elements.size();i++)
			{
				System.out.println(elements.get(i).getText());
				System.out.println("==============");
	        }

}
}
