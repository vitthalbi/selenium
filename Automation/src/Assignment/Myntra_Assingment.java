package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra_Assingment {

	public static void main(String[] args) throws InterruptedException {
		//launch the browser
				WebDriver driver=new ChromeDriver();
				//maximize the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				//launch the web application
				driver.get("https://demoapps.qspiders.com/ui?scenario=1");
				
				//click on drop-down button
				Thread.sleep(2000);
				driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
				
				//click on phone no drop-down
				driver.findElement(By.id("select1")).click();
				WebElement phone = driver.findElement(By.xpath("//select[@id='select1']"));
				Select phoneno=new Select(phone);
				phoneno.selectByValue("+91");
				
				//send contact no
				driver.findElement(By.name("ph")).sendKeys("7778889990",Keys.ENTER);
				
				//click on gender
				driver.findElement(By.id("select2")).click();
				//select gender drop-down
				WebElement selectgender = driver.findElement(By.xpath("//select[@id='select2']"));
				Select gender = new Select(selectgender);
				gender.selectByIndex(1);
				
				
				//click on drop-down button
			    driver.findElement(By.xpath("//select[@id='select3']")).click();
				//select one country
				WebElement country = driver.findElement(By.id("select3"));
				Select c = new Select(country);
				c.selectByValue("India");
				
				
				//select the state
				driver.findElement(By.xpath("//select[@id='select5']")).click();
				//select the state
				WebElement state = driver.findElement(By.id("select5"));
				Select state1=new Select(state);
				state1.selectByIndex(23);
				
			
				//select the city
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@class='w-full lg:w-4/12'][3]/descendant::select[contains(@class,'duration')]")).click();

				//select one city
				Thread.sleep(2000);
				driver.findElement(By.id("CityOpt16")).click();
				
				driver.findElement(By.xpath("//select[@id='select7']")).click();
                //click on particular index value
				WebElement click = driver.findElement(By.id("optionquantity3"));
				click.click();
				//click on continue
				driver.findElement(By.xpath("//button[text()='Continue']")).click();
				
				//get price
				Thread.sleep(2000);
				List<WebElement> price = driver.findElements(By.xpath("(//p[@class='font-bold'])[2]"));
				for(int n=0;n<price.size();n++)
				{
				System.out.print("Total-----"+price.get(n).getText());	
				}
	}

}
